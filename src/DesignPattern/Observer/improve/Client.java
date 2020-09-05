package DesignPattern.Observer.improve;

public class Client {

    public static void main(String[] args) {
        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        // 注册到WeatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
        // 测试
        System.out.println("通知各个注册的观察者，看看信息");
        weatherData.setData(10f, 100f, 30.0f);
        weatherData.removeObserver(currentConditions);
        System.out.println();
        // 测试
        System.out.println("通知各个注册的观察者，看看信息");
        weatherData.setData(10f, 100f, 30.0f);
    }

}
