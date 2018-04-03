package proxy.staticProxy;

/***
 *
 *@Author ChenjunWang
 *@Description:明星实体类
 *@Date: Created in 23:00 2018/4/1
 *@Modified By:
 *
 */
public class SuperStar implements ISuperStar {
    @Override
    public void sing() {
        System.out.println("明星：月色正朦胧，与清风把酒相送");
    }

    @Override
    public void eat() {

        System.out.println("明星吃饭……");
    }

    @Override
    public void sleep() {
        System.out.println("明星碎觉……");

    }
}
