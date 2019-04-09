package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 *
 *@Author ChenjunWang
 *@Description:代理类实现InvocationHandler接口
 *@Date: Created in 20:17 2018/4/2
 *@Modified By:
 *
 */
public class SuperStarProxy implements InvocationHandler {
    private Object target;//需要代理的对象放这

    public SuperStarProxy(Object target) {
        super();
        this.target = target;//构造函数将需要代理的对象传入
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //下面是对具体的代理逻辑
        if (method.getName().equals("eat")){

            System.out.println("代理人做好饮食搭配");
            method.invoke(target, args);

        } else {
            System.out.println("方法执行前");
            method.invoke(target, args);
            System.out.println("方法执行后");

        }

        return null;
    }
}