package command;

/***
 *
 *@Author ChenjunWang
 *@Description:关机执行类
 *@Date: Created in 0:03 2018/4/13
 *@Modified By:
 *
 */
public class CloseReceiver {
    public void action(){
        System.out.println("收到命令后关闭");
    }
    public void undo(){

        System.out.println("撤销关闭任务");
    }

}
