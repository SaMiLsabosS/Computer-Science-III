import java.util.*;
import static java.lang.System.*; 
public class QueueNotes
{
    public static void main(){
        Queue<Integer> q = new LinkedList<Integer>(); // A linked list is a list of items with data that are linked to each other and ends in null // Linked List is better than ArrayList
        
        q.add(5);
        q.add(7);
        q.add(2);
        out.println(q);
        
        while(!q.isEmpty()){
            out.println("before removal: ");
            out.println(q.remove());
        }
        
        out.println("\n\n");
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // Comes out in natural ordering (int and double and char(Capital letters before lowercase letters) is low to high) (String is alphabetically and capital letters before lowercase letters) (boolean )
        
        pq.add(5);
        pq.add(7);
        pq.add(2);
        out.println(pq);
        
        while(!pq.isEmpty()){
            out.println("before removal: ");
            out.println(pq.remove());
        }
    }
}
