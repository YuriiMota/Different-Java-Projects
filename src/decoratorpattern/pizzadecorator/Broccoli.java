package decoratorpattern.pizzadecorator;

public class Broccoli extends PizzaDecorator {
    private final Pizza pizza;
    public Broccoli(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDesk() {
        return pizza.getDesk()+"Broccoli(9.25)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+9.25;
    }
}
