package visitor;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 18:30 2018/4/12
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();
        ConcreteNodeA concreteNodeA = new ConcreteNodeA();
        ConcreteNodeB concreteNodeB = new ConcreteNodeB();
        objectStructure.add(concreteNodeA);
        objectStructure.add(concreteNodeB);
        System.out.println("------------------访问者A访问元素------------------");
        objectStructure.action(new ConcreteVisitorA());
        System.out.println("------------------访问者B访问元素------------------");
        objectStructure.action(new ConcreteVisitorB());
    }
}
