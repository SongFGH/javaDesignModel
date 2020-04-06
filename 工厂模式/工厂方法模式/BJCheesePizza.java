package funcfactory;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("准备北京奶酪pizza原材料");
    }
}
