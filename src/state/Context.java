package state;

/***
 *
 *@Author ChenjunWang
 *@Description:环境角色，定义用户所需要的接口，负责状态切换
 *@Date: Created in 19:10 2018/4/15
 *@Modified By:
 *
 */
public class Context {
    private State state;
    public static final State  LOGIN_STATE = new LoginState();
    public static final State  TOURIST_STATE = new TouristState();

    public void setState(State state) {
        this.state = state;
    }

    public void settingProfile(){
        state.settingProfile();
    }
    public void viewIndex(){
        state.viewIndex();
    }
}
