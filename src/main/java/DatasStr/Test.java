package DatasStr;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<ArrayList<Integer>> arrayLists =new ArrayList<>();
        list.add(1);
        list.add(2);
        arrayLists.add(list);
        ArrayList<Integer> list1 = new ArrayList<>(list);
        System.out.println("list1 = " + list1);

    }
}

