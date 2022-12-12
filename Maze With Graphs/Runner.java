import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
public class Runner
{
    public static void main(){
        try(BufferedReader bR = new BufferedReader(new FileReader("1st Maze.txt"))){
            Scanner input = new Scanner(bR.readLine());
            int[][] maze = new int[input.nextInt()][input.nextInt()];
            String line = "";
            int row = 0;
            int col = 0;
            while((line = bR.readLine()) != null){
                Scanner points = new Scanner(line);
                col = 0;
                while(points.hasNext()){
                    maze[row][col] = Integer.parseInt(points.next());
                    col++;
                }
                row++;
            }
            Maze m1 = new Maze(maze);
            m1.solve(0,0,""); 
            out.println(m1);
        }
        catch(IOException e){out.println(e.getMessage());}
    }
}
