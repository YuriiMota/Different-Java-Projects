package decoratorpattern.pizzadecorator;

public class Chiken extends PizzaDecorator {
    private final Pizza pizza;
    Chiken(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDesk() {
        return pizza.getDesk()+", Chiken(15.20)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+15.2;
    }
}
