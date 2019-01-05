package decoratorpattern.pizzadecorator;

public abstract class PizzaDecorator implements Pizza{
    @Override
    public String getDesk() {
        return "Toppings";
    }
}
