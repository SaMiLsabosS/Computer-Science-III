import java.io.*;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class MathSetRunner
{
    public static void main(){
       try(BufferedReader b = new BufferedReader(new FileReader("E:\\CS3\\Sets\\mathsetdata.dat"))){
          String line = "";
          int count = 0;
          String one = "";
          String two = "";
          while((line = b.readLine()) != null){
             if(count==0){
                one = line;
                count++;
             }
             else{
                two = line;
                count = 0;
                System.out.println(output(one, two));
                one = "";
                two = "";
             }
          }
       }
       catch(IOException e){System.out.println(e.getMessage());}
    }
    public static String output(String first, String second){
       MathSet set = new MathSet(first, second);
       String output = "";
       output += set+"\n";
       output+="union - "+set.union()+"\n";
       output+="intersection - "+set.intersection()+"\n";
       output+="difference A-B - "+set.differenceAMinusB()+"\n";
       output+="difference B-A - "+set.differenceBMinusA()+"\n";
       output+="symmetric difference "+set.symmetricDifference();
       return output+"\n\n"; 
    }
}
