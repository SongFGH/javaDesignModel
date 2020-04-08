package command;

// 当没有任何命令，既空执行：用于初始化每个按钮，当调用空命令时，对象什么也不做
// 这也是一种设计模式，可以省
public class NoCommand implements Command {

    @Override
    public void execute() {
        // 空执行
    }

    @Override
    public void undo() {
        // 空执行
    }
}
