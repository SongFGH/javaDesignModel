package p01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }
    public void setAbsFactory(AbsFactory factory){
        Pizza pizza = null;
        String ordertype = "";
        this.factory = factory;
        do {
            ordertype = getType();
            // factory可能是北京的工厂子类、也可能是伦敦的工厂子类
            pizza = factory.createPizza(ordertype);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    public String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
