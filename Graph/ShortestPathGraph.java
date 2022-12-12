import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import static java.lang.System.*;
public class ShortestPathGraph{
    private Map<String, ArrayList<String>> map;
    private boolean yayOrNay;
    private int shortest;
    public ShortestPathGraph(String line){
        map = new TreeMap<>();
        String[] vertices = line.split(" ");
        for(int i = 0; i < vertices.length; i++){ 
            String v1 = vertices[i].substring(0,1);
            String v2 = vertices[i].substring(1,2);
            if(map.get(v1) == null)
                map.put(v1, new ArrayList<String>());
            map.get(v1).add(v2);
            if(map.get(v2) == null)
                map.put(v2, new ArrayList<String>());
            map.get(v2).add(v1);
        }
        yayOrNay = false;
        shortest = Integer.MAX_VALUE; 
    }

    public void check(String first, String second, String placesUsed, int steps){
        ArrayList<String> next = map.get(first);
        if(next == null)
            return; 
        if(next.contains(second)){
            if(shortest >= steps)
                shortest = steps;
            yayOrNay = true;
            return;
        }
        steps++;
        for(String poss : next)
            if(!placesUsed.contains(poss))
                check(poss, second, placesUsed+first, steps);        
    }

    public String toString(){
        String output = " == ";
        if(yayOrNay)
            output += "yes in ";
        else
            return output+"no";
        return output + shortest + " steps";
    }
}