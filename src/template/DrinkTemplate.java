package template;

/***
 *
 *@Author ChenjunWang
 *@Description:饮品模板类
 *@Date: Created in 15:56 2018/4/18
 *@Modified By:
 *
 */
public abstract class DrinkTemplate {

    public void makeDrink(){
        takeBottle();
        addSomething();
        addWater();
        plasticBottle();
    }
    abstract void takeBottle();
    abstract void addSomething();
    abstract void addWater();
    void  plasticBottle(){
        System.out.println("塑封被子");
    }
}
