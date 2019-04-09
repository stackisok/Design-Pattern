package adapter;

public class VGA2HDMI extends VGA implements HDMIInterface {
    @Override
    public void outputHDMISignal() {
        outputVGASignal();
        System.out.println("转换过程…………");
        System.out.println("输出HDMI信号");
    }
}
