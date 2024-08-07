package file_;

import java.io.File;
//遍历文件夹
public class FileTest3 {
    public static void main(String[] args) {
        File f1 = new File("D:\\面试");
        //获取当前目录下所有的一级目录文件名称，到字符串数组中去返回
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }
        //获取当前目录下所有的一级目录文件名称，到文件对象数组中去返回
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());

        }



    }
}
