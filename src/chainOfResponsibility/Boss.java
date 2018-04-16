package chainOfResponsibility;

/***
 *
 *@Author ChenjunWang
 *@Description:具体处理对象老板
 *@Date: Created in 15:09 2018/4/16
 *@Modified By:
 *
 */
public class Boss extends Handler {
    @Override
    public void handleComplain(Complain complain) {

        if (complain.getLevel() == 1){
            System.out.println("1类投诉，老板能处理");
        } else {

            System.out.println("老板处理不了");
            System.out.println("无人能处理");
        }
    }
}
