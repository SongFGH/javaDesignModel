# 依赖倒转原则

基本介绍

- 高层模块不应该依赖底层模块，二者都应该依赖其抽象
- 抽象不应该依赖细节，细节应该依赖抽象
- 依赖倒转（倒置）的中心思想是面向接口编程
- 使用接口或抽象类的目的是定制好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去做

设计理念

- 相对于细节的多变性，抽象的东西要稳定的多，以抽象为基础搭建的架构比以细节为基础的架构稳定的多。在java中，抽象指的是接口和抽象类

实现方式

1. 通过接口传递实现
2. 通过构造函数实现
3. 通过setter方法

案例1：
```
// 问题：Person直接调用Email类。如果我们获取的对象是微信、短信等等，则新增类，同时Person也要增加对应的接受方法
// 解决思路：引入抽象类接口IReceiver，表示接收者，这样Person类和接口IRevice发生依赖，因为email，weixin等属于接收的范围，他们各自实现IReceive接口就行

public class DependecyInversion {
    public static void main(String[] args) {
        Penson penson = new Penson();
        penson.receice(new Email());
    }
}
class Email {
    public String getInfo(){
        return "电子邮件信息: chen@1666.com";
    }
}
class Penson {
    public void receice(Email email){
        System.out.println(email.getInfo());
    }
}

```