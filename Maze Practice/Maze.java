import java.util.Stack;
public class Maze
{
    private Stack<Position> path;
    private String[][] pathway;
    private String coordinates;
    private boolean finish;
    private int row, col;
    public Maze(String[][] first){
        row = first.length;
        col = first[0].length;
        pathway = new String[row][col];
        pathway = first; 
        coordinates = "(0,0) ";
        finish = false; 
    }
    public String[][] getPathway(){
        return pathway;
    }
    public String getCoordinates(){
        return coordinates;
    }
    public void solve(){
        Stack<Position> path = new Stack<Position>();
        path.push(new Position(0,0)); 
        while(!finish){
           int x = path.peek().getX();
           int y = path.peek().getY();
           pathway[y][x] = "-";
           if(x == col-1 && y == row-1) 
              finish=true;  
           else if(y+1 < pathway.length && pathway[y+1][x].equals("0")){ // down
              path.push(new Position(x,y+1));
              coordinates += "("+(y+1)+","+x+") ";
           }
           else if(x+1 < pathway[y].length && pathway[y][x+1].equals("0")){ // right            
              path.push(new Position(x+1,y));  
              coordinates += "("+y+","+(x+1)+") ";
           }
           else if(y-1 > 0 && pathway[y-1][x].equals("0")){ // up               
              path.push(new Position(x,y-1));
              coordinates += "("+(y-1)+","+x+") ";
           }
           else if(x-1 > 0 && pathway[y][x-1].equals("0")){ // left 
              path.push(new Position(x-1,y));
              coordinates += "("+y+","+(x-1)+") ";
           }
           else{
              pathway[y][x] = "X";
              boolean finishRemove = false;
              int startOfCoordinate = 6;
              while(!finishRemove){
                 if(coordinates.substring(coordinates.length()-startOfCoordinate,coordinates.length()-startOfCoordinate+1).equals("(")){
                    finishRemove = true;
                    coordinates = coordinates.substring(0,coordinates.length()-startOfCoordinate);
                 }
                 else
                    startOfCoordinate++;
              }
              path.pop();
           }
        }
    }
}
