package funcfactory.voltage;

public class VoltageAdapter /*对象适配器模式 implements IVoltage5V */ extends Voltage220V implements IVoltage5V {
    // 类适配器
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }

    // 对象适配器模式 
    // private Voltage220V voltage220V;
    // public VoltageAdapter(Voltage220V voltage220V{
    //     this.voltage220V = voltage220V;
    // }
    // @Override
    // public int output5V() {
    //     int dst = 0;
    //     if(voltage220V != null ){
    //         int src = voltage220V.output220V();
    //         dst = src / 44;
    //     }
    //     return dstV;
    // }

}
