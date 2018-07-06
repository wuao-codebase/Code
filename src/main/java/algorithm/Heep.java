package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Heep {
    private List<Integer> mHeep;

    public Heep() {
        this.mHeep = new ArrayList<Integer>();
    }

    int left(int i) {
        return mHeep.get(2 * i + 1);
    }

    int right(int i) {
        return mHeep.get(2 * i + 2);
    }
    int parent(int i){
        return mHeep.get((i-1)/2);
    }
    public void filterup(int start){
        int index = start;
        int parent = this.parent(index);
    }
}
