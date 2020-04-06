package p01;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String ordertype) {

        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (ordertype.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
