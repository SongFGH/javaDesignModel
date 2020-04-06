package funcfactory.qiaojie;

public class UPRightPhone extends Phone {
    public UPRightPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("直立样式手机");
    }
    public void close(){
        super.open();
        System.out.println("直立样式手机");
    }
    public void call(){
        super.open();
        System.out.println("直立样式手机");
    }
}
