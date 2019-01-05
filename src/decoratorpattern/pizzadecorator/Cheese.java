package decoratorpattern.pizzadecorator;

public class Cheese extends PizzaDecorator {
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesk() {
        return pizza.getDesk() + ", Cheese(13.50)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 13.5;

    }
}
