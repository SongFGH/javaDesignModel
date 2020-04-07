package xianyuan;

public class Client {
    public static void main(String[] args) {

        // 创建工厂类
        WebsiteFactory factory = new WebsiteFactory();

        // 客户要一个新闻类的网站
        Website website1 = factory.getWebsiteCategory("新闻");
        website1.use(new User("Tom"));

        // 客户要一个博客类的网站
        Website website2 = factory.getWebsiteCategory("博客");
        website2.use(new User("Lik"));

        Website website3 = factory.getWebsiteCategory("博客");
        website3.use(new User("Bhj"));

        System.out.println("网站分类共：" + factory.getWebsiteCount());
    }
}
