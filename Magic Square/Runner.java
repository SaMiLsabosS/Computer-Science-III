import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
public class Runner
{
    public static void main(){
        // part 1
        try(BufferedReader bR1 = new BufferedReader(new FileReader("E:\\CS3\\Magic Square\\magic1.dat"))){
            int amountOfMagicSquares = Integer.parseInt(bR1.readLine());
            for(int i = 0; i < amountOfMagicSquares; i++){
                Scanner initalInput = new Scanner(bR1.readLine());
                int colsAndRows = initalInput.nextInt();
                int[] nums = new int[colsAndRows*colsAndRows];
                Scanner input = new Scanner(bR1.readLine());
                int index = 0;
                while(input.hasNext()){
                    nums[index] = input.nextInt();
                    index++;
                }
                MagicSquare ms = new MagicSquare(colsAndRows, nums);
                out.print(ms);
                out.println(ms.isItAMagicSquare()+"\n\n");
            }
        }
        catch(IOException e){out.println("Error");}

        // part 2
        try(BufferedReader bR2 = new BufferedReader(new FileReader("E:\\CS3\\Magic Square\\magic2.dat"))){
            for(int i = 0; i < 4; i++){
                int colsAndRows = Integer.parseInt(bR2.readLine());
                MagicSquare ms = new MagicSquare(colsAndRows);
                ms.createAMagicSquare();
                ms.printMagicSquare();
            }
        }
        catch(IOException e){out.println("Error");}
    }
}
