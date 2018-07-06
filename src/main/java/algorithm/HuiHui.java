package algorithm;

import java.util.*;

public class HuiHui {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1_1","1_3","2_12","3_13","3_3","2_7","2_9","3_2","1_11");
        Map<Integer,List<Integer>> map = new LinkedHashMap<Integer,List<Integer>>();
        for(int i=0; i<list.size(); i++){
            ArrayList<Integer> arrayList = new ArrayList<Integer> ();
            for (String s : list.get(i).split("_")) {
                arrayList.add(Integer.valueOf(s));
            }
            if (map.containsKey(arrayList.get(0)))
            {
                List<Integer> integers = map.get(arrayList.get(0));
                integers.add(arrayList.get(1));
            }else{
                List<Integer> objects = new ArrayList<Integer>();
                objects.add(arrayList.get(1));
                map.put(arrayList.get(0),objects);
            }
            }
        System.out.println(map);
        }
    }
