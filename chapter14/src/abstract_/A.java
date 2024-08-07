package abstract_;

public  abstract class A {//加了abstract就是抽象类
    //抽样方法：必须用abstract修饰，只有方法签名，一定不能有方法体
    public abstract void run();//加了abstract就是抽样方法
/*
* 注意事项：1、抽象类中不一定有抽样方法，有抽样方法的类一定是抽象类
* 2、类该有的成员（成员变量、方法、构造器）抽象类都可以有
* 3、抽象类不能创建对象，仅作为一种特殊的父类，让子类继承并实现
* */
}
