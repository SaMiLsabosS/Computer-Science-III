import static java.lang.System.*;
import java.util.Stack;
public class StackNotes
{
    public static void main(){        
       // push() adds a reference on top of the stack
       // pop() return a reference that's on top of the stack and removes it 
       // peek() returns a reference that's on top of the stack but don't remove it
       // empty() returns a boolean if the stack is empty or not
       // search() returns an int that tells me how far down the object is in the stsck, top item is 1
       
       Stack<String> stack = new Stack<String>();
       
       stack.push("apple"); // position 3
       stack.push("banana"); // position 2
       stack.push("cantaloupe"); // position 1 
       
       out.println(stack.peek()); // return cantaloupe
       
       out.println(stack); // returns starting with position 1 on the right
       
       out.println(stack.pop()); // returns the popped position and removing it from the stack
       
       out.println(stack.peek()); // returns banana
       out.println(stack); // returns the stack
             
    }
}