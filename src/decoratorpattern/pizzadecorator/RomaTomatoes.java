package decoratorpattern.pizzadecorator;

public class RomaTomatoes extends PizzaDecorator {
    private final Pizza pizza;
    RomaTomatoes(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDesk() {
        return pizza.getDesk()+", RomaTomatoes (5.50)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+5.5;
    }
}
