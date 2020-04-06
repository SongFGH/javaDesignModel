package p01;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String ordertype) {

        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
