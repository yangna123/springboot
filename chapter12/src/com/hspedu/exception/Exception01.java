package com.hspedu.exception;
//异常处理
//由于出现一个不算致命的问题，导致整个系统崩溃
public class Exception01 {
    public static void main(String[] args) {
        int num1=10;
        int num2= 0;
        //int res=num1/num2;
        //如果认为一段代码有可能出现异常/问题，可以使用cry-catch异常处理机制来解决
        //快捷键：Ctrl+Alt+t
        try {
            int res=num1/num2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("出现异常的原因"+e.getMessage());
        }
    }
}
