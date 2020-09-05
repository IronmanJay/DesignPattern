package DesignPattern.Factory.absfactory.pizzastore.order;

import DesignPattern.Factory.absfactory.pizzastore.pizza.LDCheesePizza;
import DesignPattern.Factory.absfactory.pizzastore.pizza.LDPapperPizza;
import DesignPattern.Factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("papper")) {
            pizza = new LDPapperPizza();
        }
        return pizza;
    }
}
