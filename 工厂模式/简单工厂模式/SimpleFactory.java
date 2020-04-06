package gongchnag;

public class SimpleFactory {

    // 根据ordertype，返回对应pizza对象
    public Pizza createPizza(String ordertype){
        Pizza pizza = null;
        if (ordertype.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (ordertype.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if (ordertype.equals("pepper")){
            pizza = new CheesePizza();
            pizza.setName("胡椒pizza");
        }
        return pizza;
    }
}
