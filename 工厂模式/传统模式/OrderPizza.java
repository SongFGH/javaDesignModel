package gongchnag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String ordertype;
        do {
            ordertype = getType();
            if (ordertype.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊pizza");
            } else if (ordertype.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪pizza");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while ((true));
    }

    public String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
