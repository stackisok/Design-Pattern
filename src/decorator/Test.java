package decorator;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 18:15 2018/3/30
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {

        Human human = new Human();
        System.out.println("-------------------远古时候的人，出去的时候---------------------");
        human.show();
        System.out.println("-------------------后来有衣服的时候，出去的时候---------------------");
        WearHuman wearHuman = new WearHuman(human);
        wearHuman.show();

        System.out.println("-------------------再后来物质条件好的时候，出去的时候---------------------");
        JewelleryHuman jewelleryHuman = new JewelleryHuman(wearHuman);
        jewelleryHuman.show();
    }
}
