public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); // A 类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());  // C 类通过接口去依赖D类
        c.depend2(new D());
        c.depend3(new D());
    }
}


class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}


class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface3 i) {
        i.operation4();
    }

    public void depend3(Interface3 i) {
        i.operation5();
    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {
    @Override
    public void operation1() {
        System.out.println("B方法1");
    }

    @Override
    public void operation2() {
        System.out.println("B方法2");
    }

    @Override
    public void operation3() {
        System.out.println("B方法3");

    }
}

class D implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("D方法1");
    }

    @Override
    public void operation4() {
        System.out.println("D方法4");
    }

    @Override
    public void operation5() {
        System.out.println("D方法5");
    }
}