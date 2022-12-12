import java.util.ArrayList;
import java.util.Map;
public class Child implements Comparable<Child>
{
    String name, age, address;
    int niceLevel;
    public Child(String n, String ag, String ad){
        name = n;
        age = ag;
        address = ad;
        niceLevel = 0;
    }   

    @Override
    public int compareTo(Child c){ 
        return c.niceLevel - niceLevel;
    }

    public int getNiceLevel(Map<Child, ArrayList<String>> nice, Map<Child, ArrayList<String>> naughty){
        niceLevel = nice.get(this).size() - naughty.get(this).size();
        return niceLevel;
    }
}
