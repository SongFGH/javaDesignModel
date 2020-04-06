package funcfactory.voltage;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        // 类适配器
        phone.charging(new VoltageAdapter());

        //对象适配器模式
        // phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}
