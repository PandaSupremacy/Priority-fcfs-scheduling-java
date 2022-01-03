package linkedlist;

import java.util.*;
public class ToSort implements Comparator<process> {
    @Override
    public int compare(process p1, process p2) {
        return p1.arrivalTime-p2.arrivalTime;
}
}
