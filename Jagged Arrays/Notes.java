import java.util.Arrays;
public class Notes
{
    public static void main(){
        int[][] mat = new int[10][];
        for(int[] x : mat)
            System.out.println(Arrays.toString(x));

        int[][] matrix = {{4,5,6,7},{0,9},{3,5,7}};
        for(int[] x : matrix)
            System.out.println(Arrays.toString(x));
            
        int sum = 0;    
        for(int r = 0; r < matrix.length; r++)
            for(int c = 0; c < matrix[r].length; c++)
                sum += matrix[r][c];
    }
}

