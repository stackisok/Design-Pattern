package interpreter.parsestr;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 16:22 2018/4/17
 *@Modified By:
 *
 */
public abstract class NonTerminalExpression implements Expression {
    Expression e1,e2;
    public NonTerminalExpression(Expression e1, Expression e2){

        this.e1 = e1;
        this.e2 = e2;
    }
}