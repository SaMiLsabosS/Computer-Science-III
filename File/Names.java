import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;
public class Names
{
    public static void main(){
       try(BufferedReader bReader = new BufferedReader(new FileReader("E:\\CS3\\File\\Names.txt"));
           PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter("E:\\CS3\\File\\Sum.txt")))
       ){ 
          int sum = 0;
          int tempSum = 0;
          String line = "";
          while( (line = bReader.readLine()) != null){            
            Scanner input = new Scanner(line);
            while(input.hasNext()){              
              fileOut.print(input.next()+" ");
              tempSum = input.nextInt();
              fileOut.println(tempSum);              
              sum += tempSum;
            }   
          }
          fileOut.println("sum of all ages is: "+sum);
       }
       catch(IOException e){System.out.println("Error");}   
    }
}
