package decorator;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 18:27 2018/3/30
 *@Modified By:
 *
 */
public class JewelleryHuman extends HumanDecorator {

    public JewelleryHuman(IHuman human){

        super(human);
    }
    public void wearJewl(){
        System.out.println("带上饰品");
    }
    @Override
    public void show() {

        human.show();
        wearJewl();

    }
}
