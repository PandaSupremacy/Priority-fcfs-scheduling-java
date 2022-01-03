package linkedlist;
import java.util.*;
//I would be restricting the types of all my values as int to preserve simplicity.
//This is an implementation of priority scheduling using linked list.
//author: Preetibarna PAnda
class demo{
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int at,bt,priority;
            PQueue pq = new PQueue();
            System.out.println("Enter the number of processes: ");
            int l = input.nextInt();
            System.out.println("Enter your processes in the following fashion");
            System.out.println("\tArrival Time\tBurst Time\tPriority");
            for(int i = 1; i<=l; i++){
                System.out.println("Enter the details of process "+i+": ");
                at = input.nextInt();
                bt = input.nextInt();
                priority = input.nextInt();
                pq.push(i,at,bt,priority);
            }
            PriorityScheduling ps = new PriorityScheduling(pq);
            ps.display();
        }

    }
}