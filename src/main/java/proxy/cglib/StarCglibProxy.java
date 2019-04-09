package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/***
 *
 *@Author ChenjunWang
 *@Description:Cglib代理类
 *@Date: Created in 23:25 2018/4/2
 *@Modified By:
 *
 */
public class StarCglibProxy implements MethodInterceptor {

    private Object superStar;
    public Object getInstance(final Object target) {
        this.superStar = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.superStar.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("eat")){

            System.out.println("Cglib,代理人做好饮食搭配");
            method.invoke(superStar, objects);

        } else {
            System.out.println("Cglib,方法执行前");
            method.invoke(superStar, objects);
            System.out.println("Cglib,方法执行后");

        }
        return null;
    }
}
