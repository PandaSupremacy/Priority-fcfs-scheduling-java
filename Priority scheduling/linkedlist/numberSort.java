package linkedlist;

import java.util.Comparator;

public class numberSort implements Comparator<process> {
    @Override
    public int compare(process p1, process p2) {
        return p2.processNo - p1.processNo;
    }
    
}
