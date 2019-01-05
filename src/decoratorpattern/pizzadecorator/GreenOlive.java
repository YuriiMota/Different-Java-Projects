package decoratorpattern.pizzadecorator;

public class GreenOlive extends PizzaDecorator {
    private final Pizza pizza;
    GreenOlive(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDesk() {
        return pizza.getDesk()+", GreenOlive (5.50)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+5.5;
    }
}
