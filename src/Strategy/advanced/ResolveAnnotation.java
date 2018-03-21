package Strategy.advanced;

import Strategy.advanced.annotation.DiscountCondiction;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ResolveAnnotation {

    private ClassLoader classLoader = getClass().getClassLoader();//加载策略时的类加载器

    private List<Class<? extends CalcPrice>> list = new ArrayList<>();


    private DiscountCondiction resolveAnnotation(Class z){
            Annotation[] annotations = z.getDeclaredAnnotations();

            if (annotations == null || annotations.length == 0)
                return null;
            for (Annotation annotation : annotations)
                if (annotation instanceof DiscountCondiction)
                    return (DiscountCondiction)annotation;
            return null;

    }
    public CalcPrice getStrategy(double num){


        for (Class<? extends CalcPrice>  c : list){

            DiscountCondiction discountCondiction = resolveAnnotation(c);
            if (discountCondiction == null)
                continue;
            if (num >= discountCondiction.min() && num < discountCondiction.max()) {
                try {
                    return c.newInstance();
                } catch (InstantiationException e) {
                    throw new RuntimeException("策略获得失败");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }
        throw new RuntimeException("策略获得失败");



    }


    private void classInit()  {

        File file = null;
        try {
            file = new File(classLoader.getResource("Strategy/advanced").toURI());
        } catch (URISyntaxException e) {
            System.out.println("获取文件路径出错!");
        }
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".class"))
                    return true;
                return false;
            }
        });


        System.out.println(CalcPrice.class.getName());
        Class<CalcPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<CalcPrice>) classLoader.loadClass(CalcPrice.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (File f : files){
            try {
                System.out.println("Strategy/advanced/"+f.getName().replace(".class", ""));
                Class<?> clazz = classLoader.loadClass("Strategy.advanced."+f.getName().replace(".class", ""));
                if (CalcPrice.class.isAssignableFrom(clazz) && clazz != CalcPrice.class)
                    list.add((Class<? extends CalcPrice>)clazz);
            } catch (ClassNotFoundException e) {
                System.out.println("加载类失败！");
            }
        }

    }
    private ResolveAnnotation(){
        classInit();
    }

    public static void main(String[] args) throws URISyntaxException {
        ResolveAnnotation resolveAnnotation = new ResolveAnnotation();
        resolveAnnotation.classInit();
        System.out.println(resolveAnnotation.getStrategy(-22213));
    }
    public static ResolveAnnotation getresolveAnnotation(){
        return Strategy.resolveAnnotation;
    }
    private static class Strategy{
        private static ResolveAnnotation resolveAnnotation = new ResolveAnnotation();
    }

}
