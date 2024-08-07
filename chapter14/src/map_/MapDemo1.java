package map_;
//===========集合的嵌套==========

//要求在程序中记住如下省份和其对应的城市信息，记录成功后，要求可以查到
//湖北省的城市信息
//江苏省=南京市,扬州市,苏州市,无锡市,常州市
//湖北省=武汉市、孝感市、十堰市、宜昌市、鄂州市
//河北省=石家庄市、唐山市、邢台市、保定市、张家口市

import java.util.*;

//分析：1、定义一个Map集合，键：省份，值：城市，注意：城市会有多个
//2、根据湖北省这个键获取对应的值即可
public class MapDemo1 {
    public static void main(String[] args) {
        //1、定义一个Map集合存储全部省份的信息和其对应的城市信息
        Map<String, List> map = new HashMap<>();
        //
        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1,"南京市","扬州市","苏州市","无锡市","常州市");
        map.put("江苏省",cities1);
        //
        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        map.put("湖北省",cities2);
        //
        List<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3,"石家庄市","唐山市","邢台市","保定市","张家口市");
        map.put("河北省",cities3);
        System.out.println(map);

        List<String> cities = map.get("湖北省");
        for (String city : cities) {
            System.out.println(city);

        }
        //遍历全部集合
        map.forEach((k,c)->{
            System.out.println(k+"---->"+c);
        });
    }
}
