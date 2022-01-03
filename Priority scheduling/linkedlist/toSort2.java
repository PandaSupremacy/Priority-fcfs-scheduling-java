package linkedlist;
import java.util.Comparator; 
public class toSort2 implements Comparator<process> {
    @Override
    public int compare(process p1, process p2) {
        if(p1.arrivalTime == p2.arrivalTime)
            return p2.priority - p1.priority;
        else return 0;
    }       
}
    

