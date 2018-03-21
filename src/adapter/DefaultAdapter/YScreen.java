package adapter.DefaultAdapter;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 17:04 2018/3/17
 *@Modified By:
 *
 */
public class YScreen extends DefaultScreen {
    @Override
    public void getHDMISignal() {

        System.out.println("显示器显示！");
    }

    @Override
    public void getDVISignal() {

        System.out.println("显示器显示！");
    }
}
