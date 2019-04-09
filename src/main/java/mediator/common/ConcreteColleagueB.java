package mediator.common;

/***
 *
 *@Author ChenjunWang
 *@Description:同事B实现类
 *@Date: Created in 10:56 2018/4/12
 *@Modified By:
 *
 */
public class ConcreteColleagueB extends Colleague {
    public void notifyColleagueA() {
        mediator.notifyColleagueA();
    }

    @Override
    public void operation() {
        System.out.println("同事B的操作");
    }
}
