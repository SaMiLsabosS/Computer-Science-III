import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
public class Runner
{
    public static void main(){
        Scanner k = new Scanner(System.in);
        out.print("How many disks do you want in the first tower? ");
        int disks = k.nextInt();

        Tower[] towers = new Tower[3];
        towers[0] = new Tower(disks, true);
        towers[1] = new Tower(disks, false);
        towers[2] = new Tower(disks, false);

        printTowers(towers, disks);
        solve(towers[0], towers[1], towers[2], disks, towers);
    }

    public static void solve(Tower orig, Tower extr, Tower dest, int disks, Tower[] towers){
        // move n disks from A to C
        if(disks == 1){
            for(int i = orig.stack.size()-1; i > -1; i--)
                if(!orig.stack.get(i).equals("*")){
                    dest.stack.push(orig.stack.remove(i));    
                    i = -1;
                }
            orig.stack.push("*");
            for(int j = 0; j < dest.stack.size()-1; j++)
                if(dest.stack.get(j).equals("*")){
                    dest.stack.remove(j);
                    j = dest.stack.size()-1;
                }
            orig.addMoves();
            printTowers(towers, towers[0].disks);
        }
        else{
            // move n-1 disks from A to B
            solve(orig,dest,extr,disks-1,towers);
            // move one disk from A to C
            solve(orig,extr,dest,1,towers); // 1 (the one disk I need to move from A to C)
            // move n-1 disks from B to C
            solve(extr,orig,dest,disks-1,towers);
        }
    }

    public static void printTowers(Tower[] towers, int height){
        Stack[] newTowers = {new Stack<String>(), new Stack<String>(), new Stack<String>()};
        for(int towerNum = 0; towerNum < towers.length; towerNum++){
            ArrayList<String> leftOverNums = new ArrayList<String>();
            ArrayList<String> leftOverSpaces = new ArrayList<String>();
            for(int i = 0; i < height; i++){
                if(!towers[towerNum].stack.get(i).equals("*"))
                    leftOverNums.add(towers[towerNum].stack.get(i));  
                else
                    leftOverSpaces.add(towers[towerNum].stack.get(i));               
            }
            for(String num: leftOverNums) 
                newTowers[towerNum].push(num);
            for(String space: leftOverSpaces)
                newTowers[towerNum].push(space);
        }
        for(int j = height-1; j > -1; j--)
            out.println(newTowers[0].get(j)+"  "+newTowers[1].get(j)+"  "+newTowers[2].get(j));
        out.println("A  B  C");
        out.println("moves = "+(towers[0].moves + towers[1].moves + towers[2].moves)+"\n\n");
    }
}
