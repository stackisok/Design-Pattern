package proxy.cglib;


/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 20:23 2018/4/2
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        SuperStar superStar = new SuperStar();
        StarCglibProxy starCglibProxy = new StarCglibProxy();
        SuperStar proxy = (SuperStar)starCglibProxy.getInstance(superStar);

        proxy.eat();
        proxy.sing();
        proxy.sleep();
    }
}
