import java.util.Stack;
public class Tower
{
    int disks, moves;
    boolean start;
    Stack<String> stack; 

    public Tower(int d, boolean s){
        disks = d;
        start = s;
        stack = new Stack<String>();
        if(start)
            for(int i = disks; i > 0; i--)
                stack.push(Integer.toString(i));
        else
            for(int i = disks; i > 0; i--)
                stack.push("*");
    }
    
    public void addMoves(){
        moves++;
    }
}
