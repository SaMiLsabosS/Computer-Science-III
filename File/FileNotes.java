import java.io.*; // the import for io library
import java.util.*;
public class FileNotes
{
   public static void main()throws IOException{ // this throws away the exception
       // File vs. Reader/Writer
       // These objects can be buffered: the speed coming from the disc is faster 
       // than the process of interpreting what's coming from the disc.
       // The "newer" versions of a buffer reader pr anything involved in the
       // latest code is what you would use and should create for practice
       
       BufferedReader bReader = new BufferedReader(new FileReader(""));
       // More modern approach to file names
       // error will pop up because if it runs, then your computer will crash
       // write code so that there will be no error, or you can write throws IO Exception
       
       PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("")));
            
       try(BufferedReader bReader = new BufferedReader(new FileReader(""))){
          System.out.println(bReader.readLine()); // gets it and moves to the nextLine();
          int sum = 0;
          while( (line = bReader.readLine()) != null){
            System.out.println(line);
            Scanner input = new Scanner(line);
            sum += input.nextInt() + input.nextInt();
            System.out.println("  "+sum);
          }
          System.out.println(sum);
       }
       catch(IOException e){
         System.out.println(e.getMessage());
       }
   }
}
