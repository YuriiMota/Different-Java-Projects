package decoratorpattern.pizzadecorator;

public class SimplyNotVegPizza implements Pizza {
    @Override
    public String getDesk() {
        return "SimplyNotVegPizza(320)";
    }

    @Override
    public double getPrice() {
        return 320;
    }
}
