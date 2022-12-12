import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import static java.lang.System.*;
public class ShortestPathGraphRunner{
    public static void main() throws IOException{
        try(BufferedReader bR = new BufferedReader(new FileReader("graph.dat"))){
            int times = Integer.parseInt(bR.readLine());
            while(times > 0){
                ShortestPathGraph graph = new ShortestPathGraph(bR.readLine());
                String contains = bR.readLine();
                graph.check(contains.substring(0,1), contains.substring(1,2),"", 1);
                out.println(contains.substring(0,1)+" connects to "+contains.substring(1,2)+graph);
                times--;
            }
        }
        catch(IOException e){out.println(e.getMessage());}
    }
}