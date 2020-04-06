package funcfactory.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        // 1、点一份LongBack
        Drink order = new LongBlack();
        System.out.println("费用1="+order.cost());
        System.out.println("描述="+order.getDes());

        // 2、加一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶费用="+order.cost());
        System.out.println("order加入一份牛奶描述="+order.getDes());

        // 3、加一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶一份巧克力费用="+order.cost());
        System.out.println("order加入一份牛奶一份巧克力描述="+order.getDes());

        // 4. 再加一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶一份巧克力费用="+order.cost());
        System.out.println("order加入一份牛奶一份巧克力描述="+order.getDes());
    }
}
