package decoratorpattern.pizzadecorator;

public class FetaCheese extends PizzaDecorator {
    private final Pizza pizza;
    FetaCheese(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDesk() {
        return pizza.getDesk()+", FetaCheese (20.88)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+20.88;
    }
}
