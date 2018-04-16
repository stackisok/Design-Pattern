package chainOfResponsibility;

/***
 *
 *@Author ChenjunWang
 *@Description:具体处理对象经理
 *@Date: Created in 15:09 2018/4/16
 *@Modified By:
 *
 */
public class Manager extends Handler {
    @Override
    public void handleComplain(Complain complain) {

        if (complain.getLevel() == 2){
            System.out.println("2类投诉，经理能处理");
        } else {
            System.out.println("经理处理不了");
            next(complain);
        }
    }


}
