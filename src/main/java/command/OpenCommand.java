package command;

/***
 *
 *@Author ChenjunWang
 *@Description:开机命令类
 *@Date: Created in 23:50 2018/4/12
 *@Modified By:
 *
 */
public class OpenCommand implements Command {
    private OpenReceiver receiver;
    public OpenCommand(OpenReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        receiver.action();
    }

    @Override
    public void undo() {


    }
}
