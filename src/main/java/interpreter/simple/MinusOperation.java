package interpreter.simple;

/***
 *
 *@Author ChenjunWang
 *@Description:减法表达式实现类
 *@Date: Created in 16:57 2018/4/17
 *@Modified By:
 *
 */
public class MinusOperation extends NonTerminalExpression {

    public MinusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }
    //将两个表达式相减
    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) - this.e2.interpreter(context);
    }
}
