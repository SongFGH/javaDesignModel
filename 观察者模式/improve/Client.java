package obserber.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        // 注册到weatherdata
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        // 测试
        System.out.println("通知各个注册的观察者，看看信息");
        weatherData.setData(10f,20f,30f);

        weatherData.removeObserver(baiduSite);
        //  百度取消订阅
        System.out.println("通知各个注册的观察者，看看信息");
        weatherData.setData(10f,20f,30f);
    }
}
