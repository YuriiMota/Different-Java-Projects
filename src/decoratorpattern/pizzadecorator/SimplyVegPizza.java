package decoratorpattern.pizzadecorator;

public class SimplyVegPizza implements Pizza {
    @Override
    public String getDesk() {
        return "Simply Veg pizza(230)";
    }

    @Override
    public double getPrice() {
        return 230;
    }
}
