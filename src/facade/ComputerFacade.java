package facade;

/***
 *
 *@Author ChenjunWang
 *@Description:电脑外观类（封装操作）
 *@Date: Created in 23:57 2018/3/25
 *@Modified By:
 *
 */
public class ComputerFacade {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;
    public ComputerFacade(){
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }
    //开机方法，开机的一系列流程都在这个方法体里，最终电脑开机完成
    public void startComputer(){
        cpu.execute();
        disk.read();
        memory.write();
        System.out.println("一堆复杂操作…………");
        System.out.println("启动完成！");

    }
    //关机方法，关机的一系列流程都在这个方法体里，最终电脑关机完成
    public void closeComputer(){
        System.out.println("一堆复杂操作…………");
        disk.colse();
        memory.colse();
        cpu.colse();
        System.out.println("关闭完成！");

    }
}
