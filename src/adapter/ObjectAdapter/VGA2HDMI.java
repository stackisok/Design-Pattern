package adapter.ObjectAdapter;

import adapter.HDMIInterface;

public class VGA2HDMI  implements HDMIInterface {
    private VGA vga;
    VGA2HDMI(VGA vga){
        this.vga = vga;
    }
    @Override
    public void outputHDMISignal() {
        vga.outputVGASignal();
        System.out.println("转换过程…………");
        System.out.println("输出HDMI信号");
    }
}
