import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import static java.lang.System.*;
public class Runner
{
    public static void main() throws IOException{
        try(BufferedReader bR = new BufferedReader(new FileReader("flightTimes.dat"))){
            Graph graph = new Graph();
            String line = "";
            while((line = bR.readLine()) != null){
                Scanner input = new Scanner(line);
                String loc1 = input.next();
                String loc2 = input.next();
                int time = input.nextInt();
                graph.add(loc1, loc2, time); 
            }
            graph.solve("AUSTIN", "SEATTLE", "", 0);
            out.println(graph);
        }
        catch(IOException e){out.println(e.getMessage());}
    }
}
