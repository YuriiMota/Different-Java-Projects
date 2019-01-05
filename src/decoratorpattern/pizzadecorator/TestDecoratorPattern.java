package decoratorpattern.pizzadecorator;

import java.text.DecimalFormat;

public class TestDecoratorPattern {
    public static void main(String args[]){
        Pizza pizza = new SimplyVegPizza();
        DecimalFormat dformat = new DecimalFormat("#.##");

        pizza=new RomaTomatoes(pizza);
        pizza=new GreenOlive(pizza);
        pizza=new Spinach(pizza);
        System.out.println("Desk:"+pizza.getDesk());
        System.out.println("Price:"+dformat.format(pizza.getPrice()));

        pizza = new SimplyNotVegPizza();

        pizza=new Ham(new Cheese(new Cheese(new Meat(pizza))));
        System.out.println("Desk:"+pizza.getDesk());
        System.out.println("Price:"+dformat.format(pizza.getPrice()));
    }
}
