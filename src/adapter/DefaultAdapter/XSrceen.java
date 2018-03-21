package adapter.DefaultAdapter;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 17:01 2018/3/17
 *@Modified By:
 *
 */
public class XSrceen implements Screen {
    @Override
    public void getVGASignal() {
        System.out.println("显示器显示！");
    }

    @Override
    public void getHDMISignal() {
        System.out.println("显示器显示！");
    }

    @Override
    public void getDVISignal() {

    }

    @Override
    public void getDPSignal() {

    }
}
