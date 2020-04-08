package command;

public class LightOffCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者方法
        lightReceiver.off();
    }

    @Override
    public void undo() {
        // 调用接收者方法
        lightReceiver.on();
    }
}
