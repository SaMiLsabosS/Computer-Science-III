import static java.lang.System.*;
public class MagicSquare
{
    int colsAndRows;
    int[] numbers;
    int[][] matrice; // [row] [col]

    public MagicSquare(int cAR){
        colsAndRows = cAR;
        matrice = new int[colsAndRows][colsAndRows];    
    }

    public MagicSquare(int cAR, int[] n){
        colsAndRows = cAR;
        numbers = n;
        matrice = new int[colsAndRows][colsAndRows];
        int index = 0;
        for(int row = 0; row < colsAndRows; row++)
            for(int col = 0; col < colsAndRows; col++){
                matrice[row][col] = numbers[index];
                index++;
            }        
    }

    public String isItAMagicSquare(){ // 3x3 is 15, 4x4 is 34, 5x5 is 65
        boolean perfect = true;
        double totalSum = (colsAndRows)*(Math.pow(colsAndRows, 2) + 1) / 2; // n(n^2 + 1)/2
        // checking rows and columns 
        for(int row = 0; row < colsAndRows; row++){
            double rowSum = 0;
            double colSum = 0;
            for(int col = 0; col < colsAndRows; col++){
                rowSum += matrice[row][col];
                colSum += matrice[col][row];
            }
            if(rowSum != totalSum || colSum != totalSum)
                perfect = false;
        }

        // checking diagonals
        int row = 0;
        int col = colsAndRows - 1;
        double bottomDiagonalSum = 0;
        double topDiagonalSum = 0;
        while((row >= 0) && (col >= 0) && (row < colsAndRows) && (col < colsAndRows)){
            bottomDiagonalSum += matrice[row][col];
            topDiagonalSum += matrice[row][row];
            row++;
            col--;
        }
        if(bottomDiagonalSum != totalSum || topDiagonalSum != totalSum)
            perfect = false;

        if(!perfect)
            return "NOT A MAGIC SQUARE";
        return "MAGIC SQUARE";
    }

    public void createAMagicSquare(){ // works only for odd numbers
        int row = 0;
        int col = colsAndRows/2;
        int size = colsAndRows*colsAndRows;
        int num = 1;

        while(num != size+1){
            matrice[row][col] = num;
            row--;
            col++;
            num++;    

            if(row < 0)
                row = colsAndRows-1;
            if(col > colsAndRows-1)
                col = 0;

            if(matrice[row][col] != 0){
                row++;
                col--;
                if(row < 0)
                    row = colsAndRows-1;
                if(col > colsAndRows-1)
                    col = 0;
                row++;
                if(row > colsAndRows-1)
                    row = 1;
                if(col < 0)
                    col = colsAndRows-1;
            }
        }

    }

    public void printMagicSquare(){
       for(int row = 0; row < colsAndRows; row++){
            for(int col = 0; col < colsAndRows; col++){
                int num = matrice[row][col];
                if(num < 10)
                    out.print(num+"      ");
                else
                    out.print(num+"     ");
            }
            out.println();                
       }  
       out.println("\n");
    }
    
    public String toString(){
        String output = ""; 
        for(int row = 0; row < colsAndRows; row++){
            for(int col = 0; col < colsAndRows; col++)
                output += matrice[row][col]+" ";
            output += "\n";                
        }
        return output;
    }
}
