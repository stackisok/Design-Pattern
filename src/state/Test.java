package state;

/***
 *
 *@Author ChenjunWang
 *@Description:测试类
 *@Date: Created in 23:44 2018/4/14
 *@Modified By:
 *
 */
public class Test {


    public static void main(String[] args) {

        Context context = new Context();
        System.out.println("-----------------------一开始，游客状态，未登录-----------------------");
        context.setState(Context.TOURIST_STATE);
        context.viewIndex();
        context.settingProfile();
        System.out.println("-----------------------进入登陆页面，登陆后-----------------------");
        context.setState(Context.LOGIN_STATE);
        context.viewIndex();
        context.settingProfile();
    }

}
