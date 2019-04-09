package command;

/***
 *
 *@Author ChenjunWang
 *@Description:抽象命令类
 *@Date: Created in 23:39 2018/4/12
 *@Modified By:
 *
 */
public interface Command {
    void execute();
    void undo();
}
