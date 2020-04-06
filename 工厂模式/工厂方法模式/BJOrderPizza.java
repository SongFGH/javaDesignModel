package funcfactory;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if(ordertype.equals("pepper")){
            pizza = new BJPepperPizza();
        } else {
            System.out.println("创建pizza失败");
        }
        return pizza;
    }
}
