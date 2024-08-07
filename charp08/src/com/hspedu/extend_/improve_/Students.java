package com.hspedu.extend_.improve_;

public class Students {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("小学生的名字"+ name + "年龄"+ age + "成绩"+score);
    }
}
