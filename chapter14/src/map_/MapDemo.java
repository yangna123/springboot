package map_;
//某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是（A、B、C、D）
//每个学生只能选择一个景点，请统计出最终哪个景点想去的人最多

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

//分析：1、将80个学生选择的数据拿到程序中去[A、B、A、C....]
//2、准备一个Map集合用于存储统计的结果Map<String,Integer>键是景点，值是投票数量
//3、遍历80个学生选择的景点，每遍历一个景点，就看Map集合是否存在该景点，
//存在：景点+1;不存在：景点=1
public class MapDemo {
    public static void main(String[] args) {
        //把80个学生选择景点的数据拿到程序中来
        List<String> data = new ArrayList<>();
        String[] selects = {"A","B","C","D"};
        Random r = new Random();
        for (int i = 0; i <= 80; i++) {
            //每次模拟一个学生选择一个景点，存入到集合中去
            int index =r.nextInt(4);
            data.add(selects[index]);
        }
        System.out.println(data);
        //2、开始统计每个景点的投票人数
        //准备一个Map集合用于统计最终的结果
        HashMap<String, Integer> result = new HashMap<>();
        for (String s : data) {
            if(result.containsKey(s)){
                result.put(s, result.get(s)+1);
            }else {
                result.put(s,1);
            }
        }
        System.out.println(result);
    }
}
