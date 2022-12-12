import static java.lang.System.*;
import java.util.ArrayList;
public class FoodRunner
{
    public static void main(){
      /*
      ArrayList<Root> listy = new ArrayList<Root>();
      
      for(int i=0;i<10;i++){
          if(Math.random()<.5)
            listy.add(new Apple(8));
          else
            listy.add(new Kale(10));
      }
      
      for(Root b : listy)
        out.println(b+" and the root is: "+b.whatIsTheRoot());
      */
      Apple fruitOne = new Apple(5);
      Apple fruitTwo = new Apple(5);
      out.println(fruitOne.equals(fruitTwo));
      out.println(fruitOne);
      out.println(fruitOne.compareTo(fruitTwo));
      Kale veggieOne = new Kale(4);
      Kale veggieTwo = new Kale(6);
      out.println(fruitOne.equals(veggieOne));              
      out.println(fruitOne.compareTo(veggieOne));
      out.println(fruitOne.compareTo(veggieTwo));
    }
}
