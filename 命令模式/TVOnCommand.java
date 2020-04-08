package command;

public class TVOnCommand implements Command {

    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        super();
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者方法
        tvReceiver.on();
    }

    @Override
    public void undo() {
        // 调用接收者方法
        tvReceiver.off();
    }
}
