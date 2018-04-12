package mediator.common;

/***
 *
 *@Author ChenjunWang
 *@Description:同事A实现类
 *@Date: Created in 10:56 2018/4/12
 *@Modified By:
 *
 */
public class ConcreteColleagueA extends Colleague {

    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }

    @Override
    public void operation() {
        System.out.println("同事A的操作");
    }
}
