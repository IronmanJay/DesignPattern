package DesignPattern.Strategy.improve;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    public void display() {
        System.out.println("玩具鸭");
    }

    // 需要重写父类的所有方法
    public void quack() {
        System.out.println("鸭子不能叫");
    }

    public void swim() {
        System.out.println("鸭子不会游泳");
    }

}
