package dynamicproxy;

public class Client {
    public static void main(String[] args) {

        // 创建目标对象
        ITeacherDao target = new TeacherDao();

        // 给目标对象，创建代理对象, 可以强转成ITeacherDao
        ITeacherDao proxxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        System.out.println("proxxyInstance" + proxxyInstance);
        System.out.println(proxxyInstance.getClass()); // class com.sun.proxy.$Proxy0 返回$ 表示代理对象


        // 通过代理对象,调用目标对象的方法
        proxxyInstance.teacher();

        proxxyInstance.sayHello("Tom");
    }
}
