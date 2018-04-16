package chainOfResponsibility;

/***
 *
 *@Author ChenjunWang
 *@Description:具体处理服务员
 *@Date: Created in 15:08 2018/4/16
 *@Modified By:
 *
 */
public class Waiter extends Handler {
    @Override
    public void handleComplain(Complain complain) {

        if (complain.getLevel() == 3){
            System.out.println("3类投诉，服务员能处理");
        } else {
            System.out.println("服务员处理不了");
            next(complain);
        }
    }
}
