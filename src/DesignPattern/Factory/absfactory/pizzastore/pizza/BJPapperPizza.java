package DesignPattern.Factory.absfactory.pizzastore.pizza;

public class BJPapperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("给北京的胡椒pizza准备原材料");
    }

}
