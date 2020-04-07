package xianyuan;

public class ConcreteWebsite extends Website {
    private String type = "";
    // 构造器
    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式"+type+"使用者"+user.getName());
    }
}
