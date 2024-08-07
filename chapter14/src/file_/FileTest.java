package file_;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        //创建一个File对象，指代某个具体的文件。
        //File f1 = new File("D:\\简历\\aaaa.txt");
        File f1 = new File("D:/简历/aaaa.txt");//常用
        System.out.println(f1.length());//文件大小

        File f2 = new File("D:/简历/");
        System.out.println(f2.length());

        //File对象可以指代一个不存在的文件路径
        File f3 = new File("D:/简历/b.txt");
        System.out.println(f3.length());
        System.out.println(f3.exists());//文件是否存在

        //找模块中的文件（相对路径：不带盘符）
        File f4 = new File("chapter14\\src\\file_\\ithe.txt");
        System.out.println(f4.length());


    }
}
