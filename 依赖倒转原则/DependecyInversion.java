public class DependecyInversion {
    public static void main(String[] args) {
        Penson penson = new Penson();
        penson.receice(new Email());
        penson.receice(new Weixin());
    }
}

interface IReceiver {
    public String getInfo();
}
class Email implements IReceiver {
    public String getInfo(){
        return "电子邮件信息";
    }
}


class Weixin implements IReceiver{
    @Override
    public String getInfo() {
        return "微信消息";
    }
}
class Penson {
    public void receice(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
