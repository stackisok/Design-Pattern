package proxy.staticProxy;

/***
 *
 *@Author ChenjunWang
 *@Description:代理类
 *@Date: Created in 23:02 2018/4/1
 *@Modified By:
 *
 */
public class ProxySuperStar implements ISuperStar{
    private ISuperStar superStar;
    public ProxySuperStar(){
        this.superStar = new SuperStar();
        System.out.println("实例化代理类");

    }

    @Override
    public void sing() {
        System.out.println("代理人为明星做好唱歌前的准备工作……");
        superStar.sing();
        System.out.println("代理人为明星做好唱完后的扫尾工作……");

    }

    @Override
    public void eat() {

        System.out.println("代理人做好饮食搭配");
        superStar.eat();
    }

    @Override
    public void sleep() {

        superStar.sleep();
    }


}
