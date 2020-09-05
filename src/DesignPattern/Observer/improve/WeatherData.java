package DesignPattern.Observer.improve;

import java.util.ArrayList;

/**
 * 这个类是核心
 * 1.包含最新的天气情况信息
 * 2.含有观察者集合，使用ArrayList管理
 * 3.当数据有更新时，就主动的调用ArrayList，通知所有的接入方就看到最新的信息
 */
public class WeatherData implements Subject {

    private float temperatrue;
    private float pressure;
    private float humidity;
    // 观察者集合
    private ArrayList<Observer> observers;

    // 加入新的第三方
    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        // 调用接入方的update
        notifyObservers();
    }

    // 当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange，将最新的信息推送给接入方currentConditions
        dataChange();
    }

    // 注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    // 遍历所有的观察者，并通知
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updata(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
