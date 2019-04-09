package visitor;

/***
 *
 *@Author ChenjunWang
 *@Description:具体访问物类A
 *@Date: Created in 18:29 2018/4/12
 *@Modified By:
 *
 */
public class ConcreteNodeA implements Node{
    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }
}
