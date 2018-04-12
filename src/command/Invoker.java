package command;

/***
 *
 *@Author ChenjunWang
 *@Description:调用类
 *@Date: Created in 23:43 2018/4/12
 *@Modified By:
 *
 */
public class Invoker {
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        command.execute();
    }

}
