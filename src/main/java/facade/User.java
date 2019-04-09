package facade;

/***
 *
 *@Author ChenjunWang
 *@Description:用户类
 *@Date: Created in 17:31 2018/3/26
 *@Modified By:
 *
 */
public class User {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();


        System.out.println("----------------开机----------------");
        computerFacade.startComputer();
        System.out.println("----------------关机----------------");
        computerFacade.closeComputer();
    }
}
