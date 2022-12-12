import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class DupRunner
{
    public static void main(){
        System.out.println(printUAndD("a b c d e f g h a b c d e f g h i j k")); // .split as a string helps seperate the characters in the string 
        System.out.println(printUAndD("one two three one two three six seven one two"));
        System.out.println(printUAndD("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
    }
    public static String printUAndD(String sample){
        String output = "Original List : "+sample+"\n";
        String[] orgList = sample.split(" ");
        Set<String> org = new HashSet<String>();
        Set<String> unique = new HashSet<String>();
        for(String value : orgList){
           if(!unique.add(value))
              org.add(value);
           else
              unique.add(value);
        }
        return output+"Uniques : "+unique+"\nDupes : "+org+"\n\n";
    }
}
