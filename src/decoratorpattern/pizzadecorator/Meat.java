package decoratorpattern.pizzadecorator;

public class Meat extends PizzaDecorator {
    public final Pizza pizza;

    Meat(Pizza pizza) {
        this.pizza = pizza;
    }



    @Override
    public String getDesk() {
        return pizza.getDesk()+", Meat(23.20";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+23.2;
    }
}
