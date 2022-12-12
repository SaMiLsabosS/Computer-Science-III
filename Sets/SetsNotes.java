import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
public class SetsNotes
{
    public static void main(){
        // can have no duplicates
        // An union is the combination of two sets A v B
        // An intersection is everything shared by both sets A n B
        // A difference is everything that's unique in the first set A - B 
        // Symmetric difference is everything unique in both sets
        // .add() addAll() removeAll() retainAll()
        Set<Integer> setOne =  new HashSet<Integer>();
        setOne.add(8);
        setOne.add(4); // No duplicates shown in thw toString
        
        System.out.println(setOne);
        
        setOne.addAll(Arrays.asList(8,9,10,11));
        
        System.out.println(setOne);
        
        Set<Integer> setTwo = new HashSet<Integer>(Arrays.asList(8,9,10,11));
        System.out.println(setTwo);
        
        setOne.removeAll(setTwo);
        System.out.println(setOne);
        
        Set<Integer> diff =  new HashSet<Integer>();
        diff.addAll(setOne);
        diff.removeAll(setTwo);
        System.out.println(diff + "--" + setOne);
    }
}
