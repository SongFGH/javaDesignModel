package funcfactory;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("准备北京胡椒pizza原材料");
    }
}
