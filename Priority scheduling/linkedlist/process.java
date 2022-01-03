package linkedlist;

public class process {
    int arrivalTime;
    int burstTime;
    int priority;
    int completionTime;
    int waitingTime;
    int turnAroundTime;
    int processNo;
    
    process (int pno,int arrival,int burst, int priority) {
        this.processNo = pno;
        this.arrivalTime = arrival;
        this.burstTime = burst;
        this.priority = priority;
    }

    public String toString(){
        return"pno: " +processNo+" arrival: "+arrivalTime+" burst: "+burstTime+" priority: "+priority;
    }
}
