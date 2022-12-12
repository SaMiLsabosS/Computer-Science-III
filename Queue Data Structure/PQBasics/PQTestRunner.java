package PQBasics;
import static java.lang.System.*;
import java.util.*;
public class PQTestRunner
{
    public static void main(){
        Queue<String> qs1 = new LinkedList<String>(Arrays.asList("five","four","seven","two","one","three","six")); 
        print(qs1,setPriorityQueue(qs1));
        
        Queue<String> qs2 = new LinkedList<String>(Arrays.asList("1","3","2","4","5","three","five","two","four","one"));
        print(qs2,setPriorityQueue(qs2));
        
        Queue<String> qs3 = new LinkedList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"));
        print(qs3,setPriorityQueue(qs3));
    }
    public static PriorityQueue<String> setPriorityQueue(Queue<String> qs){
        PriorityQueue<String> pq = new PriorityQueue<String>();
        for(String value : qs)          
            pq.add(value); 
        out.println("toString() - "+qs);
        return pq;
    }
    public static void print(Queue<String> qs, PriorityQueue<String> pq){
        out.println("getMin() - "+qs.peek());
        out.print("getNaturalOrder() - ");
        while(!pq.isEmpty())
           out.print(pq.remove()+" ");
        out.println("\n");
    }
}
