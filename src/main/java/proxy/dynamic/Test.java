package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 20:23 2018/4/2
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ISuperStar superStar = new SuperStar();
        InvocationHandler in = new SuperStarProxy(superStar);
        Class<?> aClass = superStar.getClass();
        ISuperStar proxy = (ISuperStar)Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), in);
        proxy.eat();
        proxy.sing();
        proxy.sleep();
    }
}
