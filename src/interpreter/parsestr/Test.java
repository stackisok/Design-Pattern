package interpreter.parsestr;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 13:27 2018/4/8
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {

        Context context = new Context();
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");
        String str = "4+8-2+9+9-8";
        Expression build = Context.build(str);
        System.out.println("4+8-2+9+9-8=" + build.interpreter(context));

        context.add(a, 4);
        context.add(b, 8);
        context.add(c, 2);

        System.out.println(new MinusOperation(new PlusOperation(a,b), c).interpreter(context));
    }
}
