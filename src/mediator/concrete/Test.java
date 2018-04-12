package mediator.concrete;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 13:42 2018/4/12
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {

        Mediator chatPlatform = new ChatPlatform();
        NormalUser a = new NormalUser("A", chatPlatform);
        NormalUser b = new NormalUser("B", chatPlatform);
        NormalUser c = new NormalUser("C", chatPlatform);
        a.join();
        b.join();
        c.join();
        System.out.println("-----------------A群发送消息------------------");
        a.sendToAll("A：大家听得到吗?");
        System.out.println("-----------------A给B私发消息------------------");
        a.senToPerson("A：B,我只想和你说", "B");
        System.out.println("-----------------B给A私发消息------------------");
        b.senToPerson("B:可以，请说", "A");
        System.out.println("-----------------A离开聊天室------------------");
        a.leave();


        System.out.println("-----------------B群发送消息------------------");
        b.sendToAll("B:A能听到吗");

    }
}
