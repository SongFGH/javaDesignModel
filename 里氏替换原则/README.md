# 里氏替换原则

- 里氏替换原则(Liskov Substitution Principle)在1988年，由麻省理工学院一位姓里的女士提出
- 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象；
- 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法；
- 继承实际上让两个类耦合性增强了，给程序带来侵入性。在适当的情况下，可以通过聚合，组合，依赖来解决问题；
- 继承包含这样一层含义：父类中凡是已经实现好的方法，实际上是在设定规范和契约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个继承体系造成破坏。

案例
```
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func1(11,3));

        B b = new B();
        System.out.println(b.func1(11,3));
    }
}

class A {
    public  int func1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends A {
    // 重写了不该重写的方法
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }
    public int func2(int num1, int num2) {
        return func1(num1,num2) + 9;
    }
}

```

解决方案
![](../images/Xnip2020-04-06_00-35-18.png)