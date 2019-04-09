package chainOfResponsibility;

/***
 *
 *@Author ChenjunWang
 *@Description:处理抽象类
 *@Date: Created in 15:08 2018/4/16
 *@Modified By:
 *
 */
public abstract class Handler{

    private Handler next;//下一个处理的对象是谁

    //设置下一个处理对象，因为每一个处理对象都需要的方法，所以作为抽象类里的函数
    public void setNext(Handler next) {
        this.next = next;
    }
    public void next(Complain complain){
        next.handleComplain(complain);
    }

    abstract void handleComplain(Complain complain);
}



