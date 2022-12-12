import java.util.Arrays;
import java.util.HashSet;
public class JaggedArray
{
    int rows, cols;
    int[][] matrix;
    public JaggedArray(int r, int c){
        rows = r;
        cols = c;
        matrix = new int[rows][cols];
    }

    public void randomlyChangeRowLengths(int max){
        for(int i = 0; i < matrix.length; i++)
            matrix[i] = new int[(int)(Math.random()*max) + 1];  
    }

    public void addRandomNums(HashSet<Integer> range, int max, boolean noDuplicates){
        if(!noDuplicates)
            for(int row = 0; row < matrix.length; row++)
                addingNumsToRow(row, max, range);
        else{
            int row = 0;
            boolean finish = false;
            while(!finish){
                if(range.size() <= 10){
                    int numbersLeft = range.size();
                    if(matrix[row].length >= numbersLeft){ // last row
                        matrix[row] = new int[numbersLeft]; 
                        addingNumsToRow(row, max, range);
                        finish = true;
                    }
                    else
                        addingNumsToRow(row, max, range);
                }
                else
                    addingNumsToRow(row, max, range);
                row++;
            }
        }
    }

    public void addingNumsToRow(int row, int max, HashSet<Integer> range){
        for(int col = 0; col < matrix[row].length; col++){
            boolean added = false;
            while(!added){
                int rand = (int)(Math.random()*max) + 1;
                if(range.contains(rand)){
                    matrix[row][col] = rand;
                    range.remove(rand);
                    added = true;
                }
            }
        }
    }

    public String printVeryRandomJaggedArray(){
        String output = "";
        int sum = 0;
        int row = 0;
        boolean finish = false;
        while(!finish){
            if(matrix[row][0] != 0){
                output += Arrays.toString(matrix[row])+"\n";
                sum += matrix[row].length;
                row++;
            }
            else
                finish = true;
        }
        return output+sum;
    }

    public String toString(){
        String output = "";  
        for(int row = 0; row < matrix.length; row++)
            output += Arrays.toString(matrix[row])+"\n";        
        return output;
    }
}
