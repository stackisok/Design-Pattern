package decorator;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 17:40 2018/3/30
 *@Modified By:
 *
 */
public class Human implements IHuman {
    @Override
    public void show() {
        System.out.println("一个没穿衣服的人。");
    }
}
