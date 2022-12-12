import static java.lang.System.*;
import java.util.Scanner;
public class CoinTossRunner
{
   public static void main(){
       Scanner k = new Scanner(System.in); // Scanner setup + variables     
       int wins = 0;
       int losses = 0;
       int bet = 0;
       String side = "";
       boolean play = true;
       boolean sideUp = true;
       out.println("give me your player name: ");
       String name = k.nextLine();
       out.println("how much money is in your wallet: ");
       int money = k.nextInt();
       Player p = new Player(name, money, 0, 0);
       while(play){
         out.println("how much do you wanna bet? ");
         bet = k.nextInt();
         out.println("do you want <H>eads or <T>ails? ");
         side = k.next();        
         if((int) Math.random()==0){
           out.println("the toss was: H");
           sideUp=true;
         }
         else{
           out.println("the toss was: T");
           sideUp=false;
         }
         if((side.equals("H") && sideUp) || (side.equals("L") && !sideUp)){
           out.println("you won");
           wins++;
           p.setWins(wins);
           
         }
         else{
           out.println("you lost");
           losses++;
           p.setLosses(losses);
         }
         out.println(p);
         out.println("do you want to play again <Y> or <N>? ");
         if(k.next().equals("N"))
           play=false;
       }
   }
}