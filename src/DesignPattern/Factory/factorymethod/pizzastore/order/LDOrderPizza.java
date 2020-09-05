package DesignPattern.Factory.factorymethod.pizzastore.order;

import DesignPattern.Factory.factorymethod.pizzastore.pizza.*;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("papper")) {
            pizza = new LDPapperPizza();
        }
        return pizza;
    }

}
