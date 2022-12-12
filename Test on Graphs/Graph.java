import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import static java.lang.System.*;
public class Graph
{
    private Map<String, ArrayList<String>> map;
    private Map<String, Integer> mapTime;
    private int shortestAmountOfTime; 
    private String shortestRoute;
    public Graph(){
        map = new HashMap<>();
        mapTime = new HashMap<>();
        shortestAmountOfTime = Integer.MAX_VALUE;
        shortestRoute = "";
    }

    public void add(String location1, String location2, int time){
        if(map.get(location1) == null)
            map.put(location1, new ArrayList<String>());
        map.get(location1).add(location2);
        if(mapTime.get(location1+location2) == null)
            mapTime.put(location1+location2, Integer.MAX_VALUE);
        mapTime.put(location1+location2, time);
        
        if(map.get(location2) == null)
            map.put(location2, new ArrayList<String>());
        map.get(location2).add(location1);
        if(mapTime.get(location2+location1) == null)
            mapTime.put(location2+location1, Integer.MAX_VALUE);
        mapTime.put(location2+location1, time);
    }

    public void solve(String current, String destination, String route, int time){
        ArrayList<String> next = map.get(current); 
        if(next == null)
            return;
        route += current+" "; 
        if(next.contains(destination)){ 
            route += destination+" ";
            time += mapTime.get(current+destination);
            if(shortestAmountOfTime >= time){
                shortestAmountOfTime = time;
                shortestRoute = route;
            }
            return;
        }        
        for(String location : next)
            if(!route.contains(location)){
                time += mapTime.get(current+location);
                solve(location, destination, route, time);
            }        
    }

    public String toString(){
        return shortestRoute+"\nTime: "+shortestAmountOfTime;
    }
}
