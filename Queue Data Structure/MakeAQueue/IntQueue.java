package MakeAQueue;
import java.util.ArrayList;
import static java.lang.System.*;
public class IntQueue
{
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
	        listOfInts = new ArrayList<Integer>();
	}

	public void add(int item)
	{
	        listOfInts.add(item);
	}

	public int remove()
	{
		return listOfInts.remove(0);
	}

	public boolean isEmpty()
	{
		if(listOfInts.size()==0)
		  return true;
	        return false;
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
		String output="[";
		for(int i=0;i<listOfInts.size();i++){
		    if(i==listOfInts.size()-1)
		       output+=listOfInts.get(i);
		    else
		       output+=listOfInts.get(i)+", ";
		}
	        return output+"]";
	}
}