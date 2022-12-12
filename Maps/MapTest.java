import static java.lang.System.*;
import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.util.Scanner;
public class MapTest
{
   public static void main(){
       Map<String, String> translator = new TreeMap<>();
       String sentence = "";
       try(BufferedReader bR = new BufferedReader(new FileReader("E://CS3//Maps//spantoeng.dat"))){
           String line = "";
           int lines = Integer.parseInt(bR.readLine());
           while(lines > 0){
              line = bR.readLine();
              String[] values = line.split(" ");
              if(!translator.containsKey(values[0]))
                translator.put(values[0], new String());
              translator.put(values[0], values[1]);  
              lines--;
           }
           lines = 5;
           while(lines > 0){
              translate(translator, bR.readLine()+" ");
              lines--;
           }
       }
       catch(Exception e){out.println(e.getMessage());}
   }
   public static void translate(Map<String, String> translator, String sentence){
       String output = "";
       while(sentence.length() != 0){
          String word = "";  
          int stoppedIndex = 0;
          for(int i = 0; i < sentence.length(); i++){
             if(sentence.substring(i, i+1).equals(" ")){
                stoppedIndex = i+1;
                i = sentence.length();                
             }
             else
                word+=sentence.substring(i,i+1);
          }
          output += translator.get(word)+" ";
          sentence = sentence.substring(stoppedIndex, sentence.length());
       }
       out.println(output);
   }
}
