package stacks_MakeAStack;
import java.util.ArrayList;
import static java.lang.System.*;
public class IntStack
{
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
           listOfInts = new ArrayList<Integer>();
	}

	public void push(int item)
	{
           listOfInts.add(item);
	}

	public int pop()
	{
           Integer output = peek();
           listOfInts.remove(listOfInts.size()-1);
	   return output;
	}

	public boolean isEmpty()
	{
	   if(listOfInts.size()==0)
	     return true;
	   return false;
	}

	public int peek()
	{
	   return listOfInts.get(listOfInts.size()-1);
	}

	public String toString()
	{
           String output = "[";
           for(int i=0;i<listOfInts.size();i++){
               if(i==listOfInts.size()-1)
                 output+=listOfInts.get(i);
               else
                 output+=listOfInts.get(i)+", ";
           }           
	   return output+"]";
	}
}