package stacks_SyntaxChecker;
import static java.lang.System.*;
import java.util.*; 
public class SyntaxCheckerRunner
{
    public static void main(){
        ArrayList<Scanner> inputs = new ArrayList<Scanner>(Arrays.asList(new Scanner("( a b c ( * d e f )"),new Scanner("[ { } ]"),new Scanner("["),new Scanner("[ { < ( ) > } ]"),new Scanner("{ < h t m l [ v a l u e = 4 ] * ( 1 2 ) > { $ x } }"),new Scanner("[ o n e ] < t w o > { t h r e e } ( f o u r )"),new Scanner("c a r ( c d r ( a )  ( b ) )  )"),new Scanner("c a r ( c d r ( a )  ( b )  )")));
        //remember that you have to space out the values in the strings above so that .next() can take one value and not the whole string
        ArrayList<String> pairs =  new ArrayList<String>(Arrays.asList("()","{}","[]","<>"));
        Stack<String> open = new Stack<String>();
        Stack<String> closed = new Stack<String>();
        String output = ""; 
        String pair = "";
        for(int i=0;i<inputs.size();i++){
           while(inputs.get(i).hasNext()){
              String c = inputs.get(i).next();
              output+=c;
              if(c.equals("(") || c.equals("{") || c.equals("[") || c.equals("<"))
                 pair+=open.push(c);              
              else if(c.equals(")") || c.equals("}") || c.equals("]") || c.equals(">")){
                 closed.push(c);
                 if(!open.empty()){
                    pair+=c; 
                    for(int j=0;j<pairs.size();j++)
                        if(!open.empty() && !closed.empty() && pairs.get(j).equals(open.peek()+closed.peek())){
                           pair=pair.substring(0,pair.length()-2);
                           open.pop();
                           closed.pop();
                        }                                                                    
                 }
              }
           }
           pair="";
           if(open.empty() && closed.empty())
              output+=" is correct.\n\n";           
           else{
              output+=" is incorrect.\n\n";
              while(!open.empty())
                 open.pop();
              while(!closed.empty())
                 closed.pop();
           }
        }
        out.println(output);
    }
}
