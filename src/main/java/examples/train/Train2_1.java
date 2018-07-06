package examples.train;

import java.util.*;

public class Train2_1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            iterator.remove();

            System.out.println("next = " + next);
        }
        Map<String, Integer> stringIntegerHashMap = new HashMap<>();
        System.out.println(arrayList.isEmpty());
    }}
