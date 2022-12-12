import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class Maps
{
    public static void main(){
       Map<String, String> nameMap = new HashMap<String, String>();
       
       Map<String, ArrayList<String>> fruitMap = new HashMap<String, ArrayList<String>>();
       
       try(BufferedReader bReader = new BufferedReader(new FileReader("text1.txt"))){
          String line = "";
          while((line = bReader.readLine()) != null){
             //System.out.println(line);
             String[] values = line.split(",");
             nameMap.put(values[1].trim(),values[0]); //.trim removes spaces
             String fruit = values[2].trim();
             if(fruitMap.containsKey(fruit))
                fruitMap.put(fruit, new ArrayList<String>());
             fruitMap.get(fruit).add(values[1]);
          }
       }
       catch(Exception e){
          System.out.println(e.getMessage());
       }
       System.out.println(nameMap);
       for(String s : nameMap.keySet())
           System.out.println(s + " = " + nameMap.get(s));                                         
    }
}
