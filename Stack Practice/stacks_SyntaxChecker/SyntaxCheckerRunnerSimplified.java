package stacks_SyntaxChecker;
import static java.lang.System.*;
import java.util.*;
public class SyntaxCheckerRunnerSimplified
{
    public static void main(){
        Scanner k = new Scanner(System.in);
        ArrayList<String> pairs = new ArrayList<String>(Arrays.asList("()","{}","[]","<>"));
        boolean extra = false;
        Stack<String> open = new Stack<String>();
        for(int times=0;times<8;times++){
          String group = k.next();
          for(int i=0;i<group.length();i++){
              String character = group.substring(i,i+1);
              if(character.equals("(") || character.equals("{") || character.equals("[") || character.equals("<"))
                  open.push(character);            
              else if(character.equals(")") || character.equals("}") || character.equals("]") || character.equals(">")){
                  if(open.empty())
                    extra=true;
                  else
                    for(int j=0;j<pairs.size();j++)
                       if(!open.empty() && pairs.get(j).equals(open.peek()+character))
                          open.pop();  
              }
          }
          if(open.empty() && !extra)
            out.print("is correct\n\n");
          else if(!open.empty() || (extra && open.empty())){
            out.print("is incorrect\n\n");
            while(!open.empty())
                open.pop();
            extra=false;
          }
        }        
    }
}
