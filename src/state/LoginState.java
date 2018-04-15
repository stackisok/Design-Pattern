package state;

/***
 *
 *@Author ChenjunWang
 *@Description:登陆状态，实现登陆状态下的方法
 *@Date: Created in 19:16 2018/4/15
 *@Modified By:
 *
 */
public class LoginState extends State {
    @Override
    void settingProfile() {
        System.out.println("请设置信息！");
    }

    @Override
    void viewIndex() {

        System.out.println("欢迎进入主页！");
    }
}
