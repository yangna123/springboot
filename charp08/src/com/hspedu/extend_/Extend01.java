package com.hspedu.extend_;

public class Extend01 {
    public static void main(String[] args) {
        com.hspedu.extend_. Pupil pupil = new Pupil();
        pupil.name="银角大王";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        System.out.println("=======");
        com.hspedu.extend_.Graduate graduate = new Graduate();
        pupil.name="金角大王";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

    }
}
