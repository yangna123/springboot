package com.hspedu.encap;

public class Account {
    private String name;
    private double salary;
    private String pwd;

    //提供两个构造器
    //无参构造器
    public Account() {
    }
    //有参构造器
    public Account(String name, double salary, String pwd) {
        this.setName(name);
        this.setSalary(salary);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }
    //名字在2~4个字符之间
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else {
            System.out.println("名字要求2~4个字符，默认值为无名");
            this.name = "无名";
        }
    }

    public double getSalary() {
        return salary;
    }
    //余额必须大于20
    public void setSalary(double salary) {
        if (salary > 20) {
            this.salary = salary;
        }else {
            System.out.println("余额不足，默认值为0");
        }
    }

    public String getPwd() {
        return pwd;
    }
    //密码必须是6位
    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        }else {
            System.out.println("密码必须为6位，默认值为000000");
            this.pwd = "000000";
        }
    }
    public void showInfo(){
        System.out.println("账号信息 name=" + name + "余额" + salary +"密码" + pwd);
    }
}
