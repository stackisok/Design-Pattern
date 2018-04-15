package visitor;

/***
 *
 *@Author ChenjunWang
 *@Description:具体访问物类B
 *@Date: Created in 18:29 2018/4/12
 *@Modified By:
 *
 */
public class ConcreteNodeB implements Node{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
