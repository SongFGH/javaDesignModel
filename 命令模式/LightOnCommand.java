package command;

public class LightOnCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        super();
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 调用接收者方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        // 调用接收者方法
        lightReceiver.off();
    }
}
