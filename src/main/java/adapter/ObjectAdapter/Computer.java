package adapter.ObjectAdapter;

/***
 *
 *@Author ChenjunWang
 *@Description:
 *@Date: Created in 16:03 2018/3/17
 *@Modified By:
 *
 */
public class Computer {
    public static void main(String[] args) {
        VGA2HDMI vga2HDMI = new VGA2HDMI(new VGA());
        vga2HDMI.outputHDMISignal();
    }
}
