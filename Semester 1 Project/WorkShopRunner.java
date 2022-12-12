import static java.lang.System.*;
import java.util.Scanner;
public class WorkShopRunner
{
    public static void main(){
        Santa SC = new Santa(); 
        Child[] children = {new Child("Evan", "17", "1 Main Street"),new Child("Miro", "17", "2 Main Street"),new Child("Sherwin", "17", "3 Main Street"),new Child("Ayaan", "17", "4 Main Street"),new Child("Jon", "17", "5 Main Street"),new Child("Kwan", "17", "6 Main Street"),new Child("Dhruv", "17", "7 Main Street"),new Child("Caesar", "17", "8 Main Street"),new Child("Aman", "17", "9 Main Street"),new Child("Shaun", "16", "10 Main Street")};
        for(int i = 0; i < children.length; i++)
           SC.addChild(children[i]);
        Scanner k = new Scanner(System.in);
        boolean finish = false;
        String mainScreen = "Santa's Workshop Software v0.1\n1 - print list of children being monitored\n2 - record a nice action\n3 - record a naughty action\n4 - update nice/naughty state\n5 - print the Christmas Eve route\n8 - exit\n\nEnter menu selection: ";
        while(!finish){
            out.print(mainScreen);
            int selection = k.nextInt();
            switch(selection){
                case 1: out.println("Master List of Children\n"+SC.getKids());break;
                case 2: reportAction(SC, k, "nice");break;
                case 3: reportAction(SC, k, "naughty");break;
                case 4: SC.niceOrNaughty(); out.println("Master List of Children\n"+SC.getKids()+"List of Presents\n"+SC.getPresents()+"\n");break;
                case 5: out.println(SC.printRoute());break;
                case 6: finish = true;
            }
        }
    }
    public static void reportAction(Santa sc, Scanner k, String n){
        out.print("Master List of Children\n"+sc.getKids()+"\nSelect the child you want to add a "+n+" action to: ");
        int child = k.nextInt();
        out.print("Enter a description of the "+n+" action: ");
        k.nextLine();
        String action = k.nextLine();
        sc.addAction(child, action, n);
        out.println(sc.printNiceAndNaughtyList());
    }
}
