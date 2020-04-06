package p01;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("准备伦敦奶酪pizza原材料");
    }
}
