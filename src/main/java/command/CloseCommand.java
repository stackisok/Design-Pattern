package command;

/***
 *
 *@Author ChenjunWang
 *@Description:关机命令类
 *@Date: Created in 0:02 2018/4/13
 *@Modified By:
 *
 */
public class CloseCommand implements Command {
    private CloseReceiver closeReceiver;
    public CloseCommand(CloseReceiver closeReceiver) {
        this.closeReceiver = closeReceiver;
    }

    @Override
    public void execute() {
        closeReceiver.action();

    }

    @Override
    public void undo() {

        closeReceiver.undo();
    }
}
