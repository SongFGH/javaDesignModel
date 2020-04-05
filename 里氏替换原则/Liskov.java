public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("2-1=" + a.func1(2, 1));

        B b = new B();
        System.out.println("2+1=" + b.func1(2, 1));
        System.out.println("2+1+9=" + b.func2(2, 1));
        System.out.println("B类使用A类方法：2-1=" + b.func3(2, 1));
    }
}

class Base {
    //把基础方法和成员抽取成基类
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class A extends Base {

//    public int func1(int num1, int num2) {
//        return num1 - num2;
//    }
}

class B extends Base {

    // TODO 类 B `无意` 重写了父类 A 方法，造成原有方法发生改变。
//    @Override
//    public int func1(int num1, int num2) {
//        return num1 + num2;
//    }

    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }

    private A a = new A();//组合

    //使用 A 方法
    public int func3(int num1, int num2) {
        return this.a.func1(num1, num2);
    }
}
