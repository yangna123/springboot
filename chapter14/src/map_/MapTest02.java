package map_;

import java.util.HashMap;
import java.util.Map;
//Lambda遍历
public class MapTest02 {
    public static void main(String[] args) {
        //创建一个Map集合
        Map<String, Double> map = new HashMap<>();
        //添加元素
        map.put("张三",165.9);
        map.put("李四",168.8);
        map.put("张三",178.8);
        map.put("小羊",189.7);
        System.out.println(map);
        map.forEach((k,v)->{
            System.out.println();
        });
    }
}
