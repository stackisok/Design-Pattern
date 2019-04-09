package bridge.usepattern;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 22:57 2018/3/24
 *@Modified By:
 *
 */
public class I7CPUComputer extends Computer {
    public I7CPUComputer(OperationSystem OS) {
        setOS(OS);
    }
    @Override
    void detail() {
        System.out.println("This is i7 cpu");
    }
}
