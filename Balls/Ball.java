import static java.lang.System.*;
import java.util.Scanner;
public class Ball
{
    public static void main(){
        Scanner k = new Scanner(System.in);
        boolean bruh = true;
        while(bruh){
            out.println("What type of balls do you want? ");
            if(k.nextLine().equals("Sussy Balls")){
                out.println("Good, now pull down your pants!");
                bruh=false;
            }
            else
            out.println("Incorrect sir\n");
        }
    }
}