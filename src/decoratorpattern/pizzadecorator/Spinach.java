package decoratorpattern.pizzadecorator;

public class Spinach extends PizzaDecorator {
    private final Pizza pizza;
    Spinach(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDesk() {
        return pizza.getDesk()+", Spinach(15.70)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+15.70;
    }
}
