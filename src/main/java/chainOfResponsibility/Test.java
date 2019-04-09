package chainOfResponsibility;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 22:18 2018/4/16
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manager = new Manager();
        Waiter waiter = new Waiter();
        waiter.setNext(manager);
        manager.setNext(boss);

        System.out.println("-----------------三类投诉，桌子不干净-----------------");
        Complain complain = new Complain(3, "桌子不干净");
        waiter.handleComplain(complain);


        System.out.println("-----------------二类投诉，服务员态度不好-----------------");
        complain = new Complain(2, "我要投诉服务员");
        waiter.handleComplain(complain);
    }

}
