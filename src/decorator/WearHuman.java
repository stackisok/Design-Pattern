package decorator;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 17:53 2018/3/30
 *@Modified By:
 *
 */
public class WearHuman extends HumanDecorator{

    public WearHuman(IHuman human){

        super(human);
    }
    public void wear(){
        System.out.println("穿上了衣服");
    }
    public void show(){
        human.show();
        wear();
    }

}
