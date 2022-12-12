import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
public class Maze
{
    private int[][] searchMaze;
    private Map<Position, ArrayList<Position>> map;
    private String shortcut;
    private int shortest;
    public Maze(int[][] sM){
        searchMaze = sM;
        shortest = Integer.MAX_VALUE;
        shortcut = "";
        map = new HashMap<>();
        for(int row = 0; row < searchMaze.length; row++)
            for(int col = 0; col < searchMaze[row].length; col++){
                Position current = new Position(col, row);
                Position[] connections = {new Position(col-1, row), new Position(col, row-1), new Position(col+1, row), new Position(col, row+1)};
                for(Position point : connections){
                    int x = point.x;
                    int y = point.y;
                    if((x < searchMaze[0].length && x > -1) && (y < searchMaze.length && y > -1))
                        if(searchMaze[y][x] != 1){
                            if(map.get(current) == null)
                                map.put(current, new ArrayList<Position>());
                            map.get(current).add(point);
                        }                    
                }
            }           
    }

    public void solve(int x, int y, String path){ 
        Position pos = new Position(x,y); 
        for(Position p : map.keySet())
            if(p.toString().equals(pos.toString()))
                pos = p;        
        ArrayList<Position> connections = map.get(pos);               
        path += pos;
        if(pos.x == searchMaze[0].length - 1 && pos.y == searchMaze.length - 1){ 
            if(path.length() <= shortest){
                shortest = path.length();
                shortcut = path;
            }
            return;
        }
        for(Position point : connections)
            if(point.compareTo(path) < 1 && path.length() < shortest){
                if(point.compareTo(path) == 1)
                    return;   
                solve(point.x, point.y, path);        
            }
    }
    
    public String toString(){
        String[][] maze = new String[searchMaze.length][searchMaze[0].length];
        String output = "";
        for(int row = 0; row < maze.length; row++){
            for(int col1 = 0; col1 < maze[row].length; col1++)
                output += searchMaze[row][col1];
            output += "          ";
            for(int col2 = 0; col2 < maze[row].length; col2++){
                Position p = new Position(col2, row);
                if(p.compareTo(shortcut) == 1)
                    output += "-";
                else if(searchMaze[row][col2] == 0)
                    output += "X";
                else
                    output += searchMaze[row][col2];
            }
            output += "\n";
        }
        return output;
    }
}
