package funcfactory;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("准备伦敦胡椒pizza原材料");
    }
}
