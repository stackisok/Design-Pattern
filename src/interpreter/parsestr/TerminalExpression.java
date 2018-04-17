package interpreter.parsestr;

/***
 *
 *@Author ChenjunWang
 *@Description:终结符实现类
 *@Date: Created in 16:22 2018/4/17
 *@Modified By:
 *
 */
public class TerminalExpression implements Expression {

    String variable;
    public TerminalExpression(String variable){

        this.variable = variable;
    }
    @Override
    public int interpreter(Context context) {
        //因为要兼容之前的版本
        Integer lookup = context.lookup(this);
        if (lookup == null)
            //若在map中能找到对应的数则返回
            return Integer.valueOf(variable);
        //找不到则直接返回（认为输入的就是数字）
        return lookup;
    }
}
