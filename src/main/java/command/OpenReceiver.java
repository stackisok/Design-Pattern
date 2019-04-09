package command;

/***
 *
 *@Author ChenjunWang
 *@Description:开机执行类
 *@Date: Created in 23:43 2018/4/12
 *@Modified By:
 *
 */
public class OpenReceiver {

    public void action(){
        System.out.println("收到命令后开机");
    }
    public void undo(){

        System.out.println("撤销开机任务");
    }

}
