package template;

/***
 *
 *@Author ChenjunWang
 *@Description:珍珠奶茶饮品类
 *@Date: Created in 16:21 2018/4/18
 *@Modified By:
 *
 */
public class MilkTeaDrink extends DrinkTemplate {
    @Override
    void takeBottle() {
        System.out.println("拿放奶茶的被子");
    }

    @Override
    void addSomething() {

        System.out.println("加入珍珠");
    }

    @Override
    void addWater() {

        System.out.println("加一半牛奶");
        System.out.println("加一半红茶");
    }
}
