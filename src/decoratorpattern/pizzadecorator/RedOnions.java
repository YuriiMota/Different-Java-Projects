package decoratorpattern.pizzadecorator;

public class RedOnions extends PizzaDecorator {
    private final Pizza pizza;
    RedOnions(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDesk() {
        return pizza.getDesk()+", RedOnion(3.45)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+3.45;
    }
}
