package template;

/***
 *
 *@Author ChenjunWang
 *@Description:牛奶饮品类
 *@Date: Created in 16:17 2018/4/18
 *@Modified By:
 *
 */
public class MilkDrink extends DrinkTemplate{
    @Override
    void takeBottle() {

        System.out.println("拿牛奶杯");
    }

    @Override
    void addSomething() {

        System.out.println("加入果肉");
    }

    @Override
    void addWater() {

        System.out.println("加入牛奶");
    }
}
