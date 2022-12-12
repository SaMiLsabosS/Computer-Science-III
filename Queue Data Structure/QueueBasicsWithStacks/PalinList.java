package QueueBasicsWithStacks;
import static java.lang.System.*;
import java.util.*;
public class PalinList
{
    public static void main(){
        Queue<String> q1 = new LinkedList<String>(Arrays.asList("one","two","three","two","one"));
        Stack<String> s1 = new Stack<String>();
        s1.addAll(Arrays.asList("one","two","three","two","one"));
        out.print(q1);
        out.println(" "+isPalinlist(q1,s1)+"\n"); 
        
        Queue<String> q2 = new LinkedList<String>(Arrays.asList("1","2","3","4","5","one","two","three","four","five"));
        Stack<String> s2 = new Stack<String>();
        s2.addAll(Arrays.asList("1","2","3","4","5","one","two","three","four","five"));
        out.print(q2);
        out.println(" "+isPalinlist(q2,s2)+"\n"); 
        
        Queue<String> q3 = new LinkedList<String>(Arrays.asList("a","b","c","d","e","f","g","x","y","z","g","f","h"));
        Stack<String> s3 = new Stack<String>();
        s3.addAll(Arrays.asList("a","b","c","d","e","f","g","x","y","z","g","f","h"));
        out.print(q3);
        out.println(" "+isPalinlist(q3,s3)+"\n"); 
        
        Queue<String> q4 = new LinkedList<String>(Arrays.asList("racecar","is","racecar"));
        Stack<String> s4 = new Stack<String>();
        s4.addAll(Arrays.asList("racecar","is","racecar"));
        out.print(q4);
        out.println(" "+isPalinlist(q4,s4)+"\n"); 
        
        Queue<String> q5 = new LinkedList<String>(Arrays.asList("1","2","3","a","b","c","c","b","a","3","2","1"));
        Stack<String> s5 = new Stack<String>();
        s5.addAll(Arrays.asList("1","2","3","a","b","c","c","b","a","3","2","1"));
        out.print(q5);
        out.println(" "+isPalinlist(q5,s5)+"\n"); 
        
        Queue<String> q6 = new LinkedList<String>(Arrays.asList("chicken","is","a","chicken"));
        Stack<String> s6 = new Stack<String>();
        s6.addAll(Arrays.asList("chicken","is","a","chicken"));
        out.print(q6);
        out.println(" "+isPalinlist(q6,s6)); 
    }
    public static String isPalinlist(Queue<String> q, Stack<String> s){
        while(!q.isEmpty() && !s.isEmpty())
           if(q.remove()!=s.pop())
             return "is not a palinlist.";        
        return "is a palinlist.";
    }
}
