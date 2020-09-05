package DesignPattern.Factory.simplefactory.pizzastore.order;

// 相当于一个客户端，发出披萨的订购任务
public class PizzaStore {

    public static void main(String[] args) {

//        new OrderPizza();

        // 使用简单工厂模式
        /*new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");*/

        // 使用静态工厂模式
        new OrderPizza2();

    }

}
