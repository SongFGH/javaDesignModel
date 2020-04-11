package obserber.improve;

public class BaiduSite implements Observer {
    // 温度 气压 湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新天气情况，是由WeatherData来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("=======百度 mTemperature" + temperature + "=======");
        System.out.println("=======百度 mpressure" + pressure + "=======");
        System.out.println("=======百度 mhumidity" + humidity + "=======");
    }

}
