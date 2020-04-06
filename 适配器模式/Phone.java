package funcfactory.voltage;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5 ) {
            System.out.println("电压5v，可以开始充电");
        } else if (iVoltage5V.output5V() > 5){
            System.out.println("电压过大");
        }
    }
}
