package mediator.common;

/***
 *
 *@Author ChenjunWang
 *@Description:中介者具体实现类
 *@Date: Created in 10:57 2018/4/12
 *@Modified By:
 *
 */
public class ConcreteMediator extends Mediator {
    public ConcreteMediator(Colleague colleagueA, Colleague colleagueB) {
        super(colleagueA, colleagueB);
    }

    @Override
    public void notifyColleagueA() {
        if (colleagueA != null) {
            colleagueA.operation();
        }

    }

    @Override
    public void notifyColleagueB() {
        if (colleagueB != null) {
            colleagueB.operation();
        }

    }
}
