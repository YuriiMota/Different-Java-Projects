package decoratorpattern.pizzadecorator;

public class Ham extends PizzaDecorator {
    private final Pizza pizza;
    Ham(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDesk() {
        return pizza.getDesk()+", Ham (14.30)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+14.30;
    }
}
