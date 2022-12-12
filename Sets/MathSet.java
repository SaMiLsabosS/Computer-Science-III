import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	    one = new TreeSet<Integer>();
	    two = new TreeSet<Integer>();
	}

	public MathSet(String o, String t)
	{
	    one = new TreeSet<Integer>();
	    two = new TreeSet<Integer>();
	    String[] valOne = o.split(" ");
	    for(String val : valOne)
	       one.add(Integer.parseInt(val));
	    String[] valTwo = t.split(" ");
	    for(String val : valTwo)
	       two.add(Integer.parseInt(val));
	}

	public Set<Integer> union()
	{
	    Set<Integer> temp = new TreeSet<Integer>(one);
	    temp.addAll(two);	    
	    return temp;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> temp = new TreeSet<Integer>(one);
		temp.retainAll(two);
	    return temp;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> temp = new TreeSet<Integer>(one);
		temp.removeAll(two);
	    return temp;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> temp = new TreeSet<Integer>(two);
		temp.removeAll(one);
	    return temp;
	}
	
	public Set<Integer> symmetricDifference()
	{		
	    Set<Integer> tempOne = new TreeSet<Integer>(one);
		tempOne.removeAll(two);
		Set<Integer> tempTwo = new TreeSet<Integer>(one);
		two.removeAll(tempTwo);
		tempOne.addAll(two);
		return tempOne;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\nSet two " + two +  "\n";
	}
}