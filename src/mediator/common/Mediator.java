package mediator.common;

/***
 *
 *@Author ChenjunWang
 *@Description:中介者抽象类
 *@Date: Created in 10:51 2018/4/12
 *@Modified By:
 *
 */
public abstract class Mediator {

    protected Colleague colleagueA;
    protected Colleague colleagueB;

    public Mediator(Colleague colleagueA, Colleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void notifyColleagueA();
    public abstract void notifyColleagueB();
}
