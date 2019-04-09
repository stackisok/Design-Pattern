package template;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 16:21 2018/4/18
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("--------------要一份牛奶------------------");
        MilkDrink milkDrink = new MilkDrink();
        milkDrink.makeDrink();

        System.out.println("--------------要一份珍珠奶茶------------------");
        MilkTeaDrink milkTeaDrink = new MilkTeaDrink();
        milkTeaDrink.makeDrink();
    }
}
