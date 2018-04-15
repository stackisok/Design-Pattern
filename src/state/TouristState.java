package state;

/***
 *
 *@Author ChenjunWang
 *@Description:游客状态类，实现游客状态下的方法
 *@Date: Created in 19:20 2018/4/15
 *@Modified By:
 *
 */
public class TouristState extends State {

    @Override
    void settingProfile() {
        System.out.println("您未登陆，请先登陆！");

    }

    @Override
    void viewIndex() {

        System.out.println("欢迎进入主页！");
    }
}
