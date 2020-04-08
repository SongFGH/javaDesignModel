package command;

// 命令接口
public interface Command {

    // 执行接口
    public void execute();
    public void undo();
}
