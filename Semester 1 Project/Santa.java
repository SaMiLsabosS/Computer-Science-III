import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;
public class Santa 
{
    private ArrayList<Child> kids;
    private Hashtable<Child, Stack<String>> listOfPresents;
    private PriorityQueue<Child> route;
    private Map<Child, ArrayList<String>> childToNice, childToNaughty;
    public Santa(){
        kids = new ArrayList<Child>();
        listOfPresents = new Hashtable<>();
        route = new PriorityQueue<>(10);
        childToNice = new HashMap<>(10);
        childToNaughty = new HashMap<>(10);
    }

    public String getKids(){
        String output = "";
        for(int i = 0; i < kids.size(); i++)
            output += i+" "+kids.get(i).name+"("+kids.get(i).age+" years old)"+" is nice level = "+kids.get(i).getNiceLevel(childToNice, childToNaughty)+", "+kids.get(i).address+"\n";     
        return output+"\n"; 
    }

    public void addChild(Child c){
        kids.add(c);
        childToNice.put(c, new ArrayList<String>());
        childToNaughty.put(c, new ArrayList<String>());
        listOfPresents.put(c, new Stack<String>());
    }

    public Child getChild(int num){
        return kids.get(num);
    }

    public String getPresents(){
        String output = "";
        for(Child c : kids)
            output += c.name+" "+listOfPresents.get(c).toString()+"\n"; 
        return output;
    }

    public void addAction(int c, String action, String n){
        Child child = null;
        for(int i = 0; i < kids.size(); i++)
            if(i == c)
                child = kids.get(i);
        if(n.equals("nice"))
            childToNice.get(child).add(action);        
        else
            childToNaughty.get(child).add(action);        
    }

    public String printNiceAndNaughtyList(){
        String output = "";
        output += "Nice List\n";
        for(Child c : kids)
            output += c.name+" "+childToNice.get(c).toString()+"\n";
        output += "\n\n\nNaughty List\n";
        for(Child c : kids)
            output += c.name+" "+childToNaughty.get(c).toString()+"\n";
        return output+"\n\n"; 
    }

    public void niceOrNaughty(){
        for(Child c : kids){
            boolean containsPresent = listOfPresents.get(c).contains("present");
            boolean isEmpty = listOfPresents.get(c).empty();
            if( ((c.getNiceLevel(childToNice, childToNaughty)) >= 0 && containsPresent) || ((c.getNiceLevel(childToNice, childToNaughty)) >= 0 && isEmpty) )
                listOfPresents.get(c).push("present");          
            else if(c.getNiceLevel(childToNice, childToNaughty) < 0 && containsPresent)
                listOfPresents.get(c).pop();
            else
                listOfPresents.get(c).push("lump of coal");   
        }
    }

    public String printRoute(){
        String output = "";
        for(Child c : kids)
            route.add(c);   
        for(Child c : route){
            String toString = c.name + " " + c.address + " " + listOfPresents.get(c).size();
            if(c.niceLevel >= 0)
                output += toString+" present(s)\n";
            else
                output += toString+" lump(s) of coal\n";     
        }
        return output;
    }
}
