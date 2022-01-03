package linkedlist;
//to perform actual priority fcfs scheduling operations
import java.util.*;
public class PriorityScheduling {
    int ct = 0;
    LinkedList<process> forDisplay ;
    LinkedList<process> ll;
    PriorityScheduling(PQueue pq){
        ll=pq.getQueue();//fetching queue from PQueue class
        forDisplay = new LinkedList<process>(); //extra queue to arrange and display popped elements
    }

    //to print linked list in sequence
    public void printtll(LinkedList<process> l){
        for(int i = 0; i<l.size(); i++){
            System.out.println(l.get(i));
        }
    }


    public void gnattChart(){
        Collections.sort(ll, new ToSort());//sorting on basis of arrival time
        Collections.sort(ll, new toSort2());//sorting on a priority basis on same arrival time 
        //priority is high to low
        System.out.println("\n\nThe order of execution is:\n");
        printtll(ll); // printing sequence
        System.out.println("\n\nThe Table looks so:\n");
        int i=0;
        int max = ll.size();
        ct = ll.get(0).arrivalTime;
        //calculating ans storing in forDisplay
        while(i<max){
            process p=ll.getFirst();
            ct =ct + p.burstTime;
            p.completionTime = ct;
            p.turnAroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnAroundTime - p.burstTime;
            forDisplay.add(p);
            ll.removeFirst();
            i++;            
        }
    }

    public void display(){
        gnattChart();
        Collections.sort(forDisplay,new numberSort());
        Collections.reverse(forDisplay);
        System.out.println("P No.\t\tArrival\t\tBurst\t\tPriority\tCompletion\tWaiting\t    TurnAround");
        for(int i=0;i<forDisplay.size();i++){
            process p=forDisplay.get(i);//getting process from forDisplay one by one
            System.out.println(p.processNo+"\t\t"+p.arrivalTime+"\t\t"+p.burstTime+"\t\t"+p.priority+"\t\t"+p.completionTime+"\t\t"+p.waitingTime+"\t\t"+p.turnAroundTime);
        }
    }
}//end of class
