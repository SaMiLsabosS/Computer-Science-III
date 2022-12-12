import static java.lang.System.*;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*; 
/*
 * Course: Comp. Sci. III
 * Coder: Sami Melhem
 * Date: 9/11/21
 * Purpose: Maze Practice
*/
public class MazeRunner
{
    public static void main(){
        try(PrintWriter fileOut =  new PrintWriter(new BufferedWriter(new FileWriter("mazeOutput.txt")))){
           LinkedList<String> mazes = new LinkedList<String>(Arrays.asList("maze3.txt","bigmaze5.txt"));
           for(int mazeNum=0;mazeNum<mazes.size();mazeNum++){
              String[][] original = createMaze(mazes.get(mazeNum));
              Maze maze = new Maze(createMaze(mazes.get(mazeNum)));        
              maze.solve();
              print(original, maze.getPathway(), maze.getCoordinates(),fileOut);
           }
        }
        catch(IOException e){out.println("Error");}
    }
    public static String[][] createMaze(String fileName){
        String[][] maze = new String[0][0];
        try(BufferedReader bReader = new BufferedReader(new FileReader(fileName))){            
            String line = "";
            int row = 0;
            int col = 0;
            boolean first = true;
            while((line = bReader.readLine()) != null){               
               Scanner input = new Scanner(line);
               col = 0;
               if(first){
                  maze = new String[input.nextInt()][input.nextInt()];
                  first = false;
               }
               else{
                  while(input.hasNext()){                                    
                      maze[row][col] = input.next();
                      col++;                  
                  }
                  row++;
               }
            }
        }
        catch(IOException e){out.println("Error");} 
        return maze;
    }
    public static void print(String[][] original, String[][] pathway, String coordinates, PrintWriter fileOut){
       for(int row=0;row<original.length;row++){
          for(int colOne=0;colOne<original[row].length;colOne++)
                 fileOut.print(original[row][colOne]+" "); // adds each coordinate from the original maze to the singular row of values             
          fileOut.print("           ");
          for(int colTwo=0;colTwo<pathway[row].length;colTwo++)
             fileOut.print(pathway[row][colTwo]+" ");  // adds each coordinate from the changed maze to the singular row of values 
          fileOut.print("\n");
       }
       fileOut.println();
       int times = 0;
       while(coordinates.length()>1){
          if(times==10){
             fileOut.print("\n");
             times = 0;
          }
          else{
             times++;
             boolean finishRemove = false;
             int endOfCoordinate = 4;
             while(!finishRemove){
                if(coordinates.substring(endOfCoordinate,endOfCoordinate+1).equals(")")){
                   fileOut.print(coordinates.substring(0,endOfCoordinate+2));
                   coordinates = coordinates.substring(endOfCoordinate+2,coordinates.length());
                   finishRemove = true;
                }
                else
                   endOfCoordinate++;
             }
          }
       }
       fileOut.println("\n");         
    }
}
