package DesignPattern.Strategy.improve;

public class PekingDuck extends Duck {

    // 假设北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }

}
