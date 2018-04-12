package mediator.concrete;


/***
 *
 *@Author ChenjunWang
 *@Description:普通用户
 *@Date: Created in 13:42 2018/4/12
 *@Modified By:
 *
 */
public class NormalUser extends User {


    public NormalUser(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendToAll(String msg) {
        mediator.sendToAll(msg);

    }

    @Override
    void senToPerson(String msg, String name) {

        mediator.senToPerson(msg, name);
    }

    @Override
    void accept(String msg) {
        System.out.println(this.name + "收到消息：" + msg );
    }

    @Override
    void join() {
        mediator.join(this);
    }

    @Override
    void leave() {

        mediator.leave(this);
    }
}
