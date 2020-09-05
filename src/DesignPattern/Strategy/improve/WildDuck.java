package DesignPattern.Strategy.improve;

public class WildDuck extends Duck {

    // 构造器，传入FlyBehavior对象
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
