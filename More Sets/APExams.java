import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class APExams
{
    public static void main(){
       Set<String> scores = new HashSet<String>();
       Set<String> testers = new HashSet<String>();
       try(BufferedReader b = new BufferedReader(new FileReader("E:\\CS3\\More Sets\\Scores4Plus.dat"))){
          String line = "";
          while((line = b.readLine()) != null)
              scores.add(line);          
       }
       catch(IOException e){System.out.println(e.getMessage());}
       try(BufferedReader b = new BufferedReader(new FileReader("E:\\CS3\\More Sets\\VR AP Testers.dat"))){
          String line = "";
          while((line = b.readLine()) != null)
             testers.add(line);           
       }
       catch(IOException e){System.out.println(e.getMessage());}
       scores.retainAll(testers);
       System.out.println("VR students scoring 4+: "+scores);
    }
}
