package map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        //创建一个Map集合
        Map<String, Double> map = new HashMap<>();
        //添加元素
        map.put("张三",165.9);
        map.put("李四",168.8);
        map.put("张三",178.8);
        map.put("小羊",189.7);
        System.out.println(map);

        //1、调用Map集合提供的entrySet方法，把Map集合转换成键值对类型的Set集合
        Set<Map.Entry<String,Double>> entries =map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key=entry.getKey();
            Double value=entry.getValue();
            System.out.println(key+"=====>"+value);


        }
    }
}
