package obserber;

public class Client {
    public static void main(String[] args) {
        // 创建接入方currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建weatherDatad
        WeatherData weatherData = new WeatherData(currentConditions);

        weatherData.setData(30,40,50);
        weatherData.setData(10,60,60);
    }
}
