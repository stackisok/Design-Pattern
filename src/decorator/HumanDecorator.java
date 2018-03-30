package decorator;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 18:31 2018/3/30
 *@Modified By:
 *
 */
public abstract class HumanDecorator implements IHuman {
    protected IHuman human;

    public HumanDecorator(IHuman human){

        this.human = human;
    }
    @Override
    public void show() {

        human.show();
    }
}
