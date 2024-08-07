package file_;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\Javacode\\week1\\Array.java");
        //文件是否存在
        System.out.println(f1.exists());
        //判断指代的是否是文件
        System.out.println(f1.isFile());
        //判断指代的是否是文件夹
        System.out.println(f1.isDirectory());
        //获取文件的名称（包含后缀）
        System.out.println(f1.getName());
        //获取文件的大小，返回字节个数
        System.out.println(f1.length());
        //创建文件
        File f6 = new File("E:\\Javacode\\week1\\nums.txt");
        System.out.println(f6.createNewFile());
        //创建文件（只能创建一级文件）
        File f7 = new File("E:\\Javacode\\week1\\aaa.txt");
        System.out.println(f7.mkdir());
        //创建多级文件
        File f8 = new File("E:\\Javacode\\week1\\aaa\\bbb\\ccc");
        System.out.println(f8.mkdirs());
        System.out.println(f8.delete());
        System.out.println(f7.delete());
        System.out.println(f6.delete());


    }
}
