package stacks_PostFixSolver;
import static java.lang.System.*;
import java.util.*; 
public class PostfixRunnerSimplified
{
    public static void main(){
        ArrayList<Scanner> inputs = new ArrayList<Scanner>(Arrays.asList(new Scanner("2 7 + 1 2 + +"),new Scanner("1 2 3 4 + + +"),new Scanner("9 3 * 8 / 4 +"),new Scanner("3 3 + 7 * 9 2 / +"),new Scanner("9 3 / 2 * 7 9 * + 4 -"),new Scanner("5 5 + 2 * 4 / 9 +")));
        Stack<Double> s = new Stack<Double>(); 
        String nums = "0123456789";
        for(int i=0;i<inputs.size();i++){
           double num=0;
           int times=0;
           while(inputs.get(i).hasNext()){              
              String value = inputs.get(i).next();             
              if(nums.contains(value)){
                  out.print(Math.round(s.push(Double.parseDouble(value)))+" "); 
                  times++;
              }
              else{
                  out.print(value+" ");
                  s.push(conversion(s, value, times));   
                  times=0;
              }              
           }
           while(!s.empty())
              num+=s.pop();
           out.print("= "+num+"\n");
        }
    }
    public static double conversion(Stack<Double> s, String value, int times){        
        double num = s.pop();
        if(times==1)
           switch(value){
               case "+" : num+= s.pop(); break;
               case "-" : num= s.pop()-num; break;
               case "*" : num*= s.pop(); break;
               case "/" : num= s.pop()/num; 
           } 
        else if(num!=0)
           for(int i=0;i<times-1;i++)
               switch(value){
                   case "+" : num+= s.pop(); break;
                   case "-" : num= s.pop()-num; break;
                   case "*" : num*= s.pop(); break;
                   case "/" : num= s.pop()/num; 
               }                                
        return num;
    }    
}
