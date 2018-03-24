package bridge.usepattern;



/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 22:34 2018/3/24
 *@Modified By:
 *
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("客户买 linux i5版本!");

        I5CPUComputer i5LinuxCPUComputer = new I5CPUComputer(new LinuxOS());
        i5LinuxCPUComputer.detail();
        i5LinuxCPUComputer.operation();

        System.out.println("客户买 windows i5版本!");
        I5CPUComputer i5WindowsCPUComputer = new I5CPUComputer(new WindowsOs());
        i5WindowsCPUComputer.detail();
        i5WindowsCPUComputer.operation();

    }
}
