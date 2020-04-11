package obserber.improve;

import java.util.ArrayList;

//1、类是核心类
//2、含有CurrentConditions对象
//3、当数据有更新时，就主动调用CurrentConditions对象的update方法
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    // 观察者集合
    private ArrayList<obserber.improve.Observer> observers;

    public WeatherData() {
        observers = new ArrayList<obserber.improve.Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        notifyObserver();
    }

    // 当数据有更新时，就调用setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 把最新信息推送给接入方
        dataChange();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
}
