package bridge.notusepattern;

import bridge.usepattern.I5CPUComputer;
import bridge.usepattern.WindowsOs;

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
        I5CPULinuxComputer i5CPULinuxComputer = new I5CPULinuxComputer();
        i5CPULinuxComputer.operation();
        i5CPULinuxComputer.detail();


        System.out.println("客户买 windows i5版本!");
        I5CPUWindowsComputer i5CPUWindowsComputer = new I5CPUWindowsComputer();
        i5CPUWindowsComputer.operation();
        i5CPUWindowsComputer.detail();
        I5CPUComputer i5WindowsCPUComputer = new I5CPUComputer(new WindowsOs());
    }
}
