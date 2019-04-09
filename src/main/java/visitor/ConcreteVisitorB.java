package visitor;

/***
 *
 *@Author ChenjunWang
 *@Description:具体访问者B
 *@Date: Created in 17:45 2018/4/12
 *@Modified By:
 *
 */
public class ConcreteVisitorB implements Visitor{
    @Override
    public void visit(ConcreteNodeA concreteNodeA) {
        //具体处理过程写这里面
        System.out.println("ConcreteVisitorB 处理 concreteNodeA");
    }

    @Override
    public void visit(ConcreteNodeB concreteNodeB) {
        //具体处理过程写这里面
        System.out.println("ConcreteVisitorB 处理 concreteNodeB");
    }
}
