package mediator.concrete;


/***
 *
 *@Author ChenjunWang
 *@Description:用户抽象类
 *@Date: Created in 13:35 2018/4/12
 *@Modified By:
 *
 */
public abstract class User {
    protected Mediator mediator;
    String name;
    public User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
    abstract void sendToAll(String msg);

    abstract void senToPerson(String msg, String name);

    abstract void accept(String msg);

    abstract void join();

    abstract void leave();
}
