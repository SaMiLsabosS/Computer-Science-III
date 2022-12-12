import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;
public class OddEvenSets
{
    public static void main(){
        try(BufferedReader b = new BufferedReader(new FileReader("E:\\CS3\\Sets\\oddevent.dat"))){
           String line = "";
           while((line = b.readLine()) != null){
              System.out.println(seperate(line)); 
           }
        }
        catch(IOException e){System.out.println(e.getMessage());}
    }
    public static String seperate(String nums){
        Set<Integer> odds = new TreeSet<Integer>();
        Set<Integer> evens = new TreeSet<Integer>();
        Scanner k = new Scanner(nums);
        while(k.hasNext()){
           int num = k.nextInt();
           if(num % 2 == 1)
              odds.add(num);           
           else
              evens.add(num);           
        }
        return "ODDS: "+odds+"\nEVENS: "+evens+"\n\n";
    }
}
