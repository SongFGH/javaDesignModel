package funcfactory.qiaojie;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }
    public void close(){
        super.open();
        System.out.println("折叠样式手机");
    }
    public void call(){
        super.open();
        System.out.println("折叠样式手机");
    }
}
