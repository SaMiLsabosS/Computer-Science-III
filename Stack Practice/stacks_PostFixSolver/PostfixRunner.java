package stacks_PostFixSolver;
import static java.lang.System.*;
import java.util.*; 
public class PostfixRunner
{
    public static void main(){
        ArrayList<Scanner> inputs = new ArrayList<Scanner>(Arrays.asList(new Scanner("2 7 + 1 2 + +"),new Scanner("1 2 3 4 + + +"),new Scanner("9 3 * 8 / 4 +"),new Scanner("3 3 + 7 * 9 2 / +"),new Scanner("9 3 / 2 * 7 9 * + 4 -"),new Scanner("5 5 + 2 * 4 / 9 +")));
        Stack<String> s = new Stack<String>(); 
        String output="";
        for(int i=0;i<inputs.size();i++){
           double num=0;
           int times=0;
           while(inputs.get(i).hasNext()){              
              String value = inputs.get(i).next();             
              if(isNumber(value)){
                  output+=s.push(value)+" "; 
                  times++;
              }
              else{
                  output+=value+" ";
                  s.push(String.valueOf(conversion(s, value, times)));   
                  times=0;
              }              
           }
           while(!s.empty())
              num+=Double.parseDouble(s.pop());
           output+="= "+num+"\n";
        }
        out.println(output);
    }
    public static boolean isNumber(String value){
        String numbers = "0123456789";
        if(numbers.contains(value))
            return true;                            
        return false;
    }
    public static double conversion(Stack<String> s, String value, int times){        
        double num = Double.parseDouble(s.pop());
        if(times==1)
           switch(value){
               case "+" : num+= Double.parseDouble(s.pop()); break;
               case "-" : num= Double.parseDouble(s.pop())-num; break;
               case "*" : num*= Double.parseDouble(s.pop()); break;
               case "/" : num= Double.parseDouble(s.pop())/num; 
           } 
        else if(num!=0)
           for(int i=0;i<times-1;i++)
               switch(value){
                   case "+" : num+= Double.parseDouble(s.pop()); break;
                   case "-" : num= Double.parseDouble(s.pop())-num; break;
                   case "*" : num*= Double.parseDouble(s.pop()); break;
                   case "/" : num= Double.parseDouble(s.pop())/num; 
               }                                
        return num;
    }    
}
