package mediator.common;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 10:59 2018/4/12
 *@Modified By:
 *
 */
public class Test {
    public static void main(String[] args) {
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA();
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB();
        ConcreteMediator concreteMediator = new ConcreteMediator(concreteColleagueA, concreteColleagueB);
        concreteMediator.notifyColleagueA();
        concreteMediator.notifyColleagueB();
    }
}
