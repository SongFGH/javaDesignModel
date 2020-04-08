package command;

public class TVOffCommand implements Command {

    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        super();
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者方法
        tvReceiver.off();
    }

    @Override
    public void undo() {
        // 调用接收者方法
        tvReceiver.on();
    }
}
