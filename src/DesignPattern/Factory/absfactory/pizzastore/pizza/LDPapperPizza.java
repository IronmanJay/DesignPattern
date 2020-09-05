package DesignPattern.Factory.absfactory.pizzastore.pizza;

public class LDPapperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("给伦敦的胡椒pizza准备原材料");
    }

}
