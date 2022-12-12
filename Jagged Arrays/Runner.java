import java.util.Arrays;
import static java.lang.System.*;
import java.util.HashSet;
import java.util.ArrayList;
public class Runner
{
    public static void main(){
        JaggedArray[] matrices = {new JaggedArray(10,0), new JaggedArray(10,0), new JaggedArray(100,0)};
        ArrayList<HashSet<Integer>> ranges = new ArrayList<>();
        ranges.add(createRange(100));
        ranges.add(createRange(100));
        // part A 
        for(int i = 0; i < matrices[0].rows; i++)
            matrices[0].matrix[i] = new int[i+1]; 
        out.println(matrices[0]);
        // part B
        matrices[1].randomlyChangeRowLengths(10);
        out.println(matrices[1]);
        // part C
        matrices[1].addRandomNums(ranges.get(0), 99, false);
        out.println(matrices[1]);
        // part D
        matrices[2].randomlyChangeRowLengths(10); 
        matrices[2].addRandomNums(ranges.get(1), 99, true);
        out.println(matrices[2].printVeryRandomJaggedArray());
    }

    public static HashSet<Integer> createRange(int max){
        HashSet<Integer> range = new HashSet<>();
        for(int i = 1; i < max; i++)
            range.add(i);
        return range;
    }
}
