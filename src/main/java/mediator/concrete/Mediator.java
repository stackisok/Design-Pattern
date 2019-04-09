package mediator.concrete;

import java.util.ArrayList;
import java.util.List;

/***
 *
 *@Author ChenjunWang
 *@Description:中介者抽象类
 *@Date: Created in 13:34 2018/4/12
 *@Modified By:
 *
 */
public abstract class Mediator {

    List<User> list = new ArrayList<>();

    abstract void sendToAll(String msg);

    abstract void senToPerson(String msg, String name);

    abstract void join(User user);

    abstract void leave(User user);
}
