package stacks_MakeAStack;
import java.util.ArrayList;
import static java.lang.System.*;
public class IntStackRunner
{
	public static void main()
	{
		IntStack test = new IntStack();
		test.push(5);
		test.push(7);
		test.push(9);
		out.println(test);
		out.println(test.isEmpty());
		out.println(test.pop());
		out.println(test.peek());
		out.println(test.pop());
		out.println(test.pop());
		out.println(test.isEmpty());
		out.println(test);

		out.println();
		
		IntStack testTwo = new IntStack();
		out.println(testTwo);
		out.println(testTwo.isEmpty());	
		testTwo.push(8);
		out.println(testTwo.pop());
		testTwo.push(1);
		testTwo.push(3);
		out.println(testTwo.peek());
		testTwo.push(6);
		out.println(testTwo);
		out.println(testTwo.isEmpty());	
		testTwo.push(4);
		testTwo.push(2);
		out.println(testTwo);
		out.println();
		
		IntStack testThree = new IntStack();	
		testThree.push(8);
		out.println(testThree.isEmpty());
		out.println(testThree.pop());
		testThree.push(2);
		testThree.push(10);
		out.println(testThree);
		testThree.push(6);
		out.println(testThree.peek());
		out.println(testThree.isEmpty());	
		testThree.push(21);
		testThree.push(32);
		out.println(testThree);
	}
}