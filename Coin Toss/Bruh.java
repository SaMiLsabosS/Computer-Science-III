import static java.lang.System.*;
import java.util.Scanner;
public class Bruh
{
    public static void main(){
       Scanner k = new Scanner(System.in);
       out.println("Do you want a cookie? ");
       out.println(bruh(k.next()));
    }
    public static String bruh(String a){
       if(a.equals("yes"))
         return "bruh";
       return "*ignores*";
    }
}
