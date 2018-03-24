package bridge.usepattern;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 22:57 2018/3/24
 *@Modified By:
 *
 */
public class I5CPUComputer extends Computer {
    public I5CPUComputer(OperationSystem OS) {
        setOS(OS);
    }

    @Override
    void detail() {
        System.out.println("This is i5 cpu");
    }

}
