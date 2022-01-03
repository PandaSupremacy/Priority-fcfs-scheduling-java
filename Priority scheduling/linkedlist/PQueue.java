package linkedlist;
import java.util.LinkedList;
//class which creates a  queue of type process
public class PQueue {
    LinkedList<process> pqueue ;
    public PQueue(){
        pqueue = new LinkedList<process>();
    }
    public void push(int pno,int arrival,int burst, int priority){
        process newProcess = new process(pno,arrival,burst, priority);
        if(pqueue.isEmpty()){
            pqueue.add(newProcess);
        }
        else{
            int i = 0;
            while(i < pqueue.size() && pqueue.get(i).priority < priority){
                i++;
            }
            pqueue.add(i, newProcess);
        }
    }
    public LinkedList<process> getQueue(){
        return pqueue;
    }
}
