package DesignPattern.Factory.absfactory.pizzastore.order;

import DesignPattern.Factory.absfactory.pizzastore.pizza.BJCheesePizza;
import DesignPattern.Factory.absfactory.pizzastore.pizza.BJPapperPizza;
import DesignPattern.Factory.absfactory.pizzastore.pizza.Pizza;

// 这是工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("papper")) {
            pizza = new BJPapperPizza();
        }
        return pizza;
    }
}
