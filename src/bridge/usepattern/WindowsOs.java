package bridge.usepattern;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 22:19 2018/3/24
 *@Modified By:
 *
 */
public class WindowsOs implements OperationSystem {
    @Override
    public void operation() {
        System.out.println("This is windows");
    }
}
