package stacks_Basics;
import static java.lang.System.*;
import java.util.*; // ArrayList import shortcut
public class StackTestRunner
{
    public static void main(){   
        ArrayList<Scanner> inputs = new ArrayList<Scanner>(Arrays.asList(new Scanner("a b c d e f g h i"),new Scanner("1 2 3 4 5 6 7 8 9 10"),new Scanner("# $ % ^ * ( ) ) _")));
        Stack<String> s = new Stack<String>();      
        for(int i=0;i<inputs.size();i++){
           while(inputs.get(i).hasNext())
             s.push(inputs.get(i).next());        
           out.println(s+"\n");    
           out.println(print(s)+"\n"); 
        }
    }
    public static String print(Stack<String> s){ // Don't pass the scanner because all the variables are in the stack
        String output = "popping all items from the stack\n";
        while(!s.empty())
            output+=s.pop()+" ";        
        return output+"\n";
    }
}
