package command;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 23:51 2018/4/12
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new OpenCommand(new OpenReceiver()));
        invoker.action();
        invoker.setCommand(new CloseCommand(new CloseReceiver()));
        invoker.action();

    }
}
