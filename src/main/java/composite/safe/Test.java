package composite.safe;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 21:42 2018/3/29
 *@Modified By:
 *
 */
public class Test {


    public static void main(String[] args) {
        Composite composite1 = new Composite(1);
        Composite composite2 = new Composite(12);
        Composite composite3 = new Composite(23);
        Component leaf = new Leaf(34);
        composite1.add(composite2);
        composite2.add(composite3);
        composite3.add(leaf);
        System.out.println("从父节点1开始show");
        composite1.show();
        System.out.println("从父节点3开始show");
        composite3.show();

    }
}
