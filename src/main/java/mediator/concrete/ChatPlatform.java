package mediator.concrete;

/***
 *
 *@Author ChenjunWang
 *@Description:聊天平台
 *@Date: Created in 13:39 2018/4/12
 *@Modified By:
 *
 */
public class ChatPlatform extends Mediator {
    @Override
    void sendToAll(String msg) {

        for (User u : list){
            u.accept(msg);
        }
    }

    @Override
    void senToPerson(String msg, String name) {
        for (User u : list){

            if (u.name.equals(name))
                u.accept(msg);
        }

    }

    @Override
    void join(User user) {
        list.add(user);
    }

    @Override
    void leave(User user) {

        list.remove(user);
    }
}
