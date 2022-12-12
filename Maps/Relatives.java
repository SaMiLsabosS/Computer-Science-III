import java.io.*;
import static java.lang.System.*;
import java.util.Set; 
import java.util.TreeSet; 
import java.util.Map;
import java.util.HashMap;
public class Relatives
{
   public static void main(){
       try(BufferedReader bReader = new BufferedReader(new FileReader("relatives.dat"))){
          Map<String, Set<String>> nameMap = new HashMap<String, Set<String>>();
          String line = "";
          int lines = Integer.parseInt(bReader.readLine());
          while(lines > 0){
             line = bReader.readLine();
             String[] values = line.split(" ");
             if(!nameMap.containsKey(values[0]))
                nameMap.put(values[0], new TreeSet<String>());
             nameMap.get(values[0]).add(values[1]);             
             if(!nameMap.containsKey(values[1]))
                nameMap.put(values[1], new TreeSet<String>());
             nameMap.get(values[1]).add(values[0]); 
             lines--;
          }
          for(String key: nameMap.keySet()){
             out.print(key + " is related to: ");
             Set<String> set = new TreeSet<String>(nameMap.get(key));
             for(String name : set)
                 out.print(name + " ") ;         
             out.println();
          }
       }
       catch(Exception e){
          out.println(e.getMessage()); 
       }
   }
}
