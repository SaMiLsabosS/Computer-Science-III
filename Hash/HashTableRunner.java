import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;
public class HashTableRunner
{
    public static void main(){
        try(BufferedReader bR = new BufferedReader(new FileReader("numbers.dat"))){
            HashTable hashTable = new HashTable();		
            String line = "";
            int lines = Integer.parseInt(bR.readLine());
            while(lines > 0){
                line = bR.readLine();
                Number value = new Number(Integer.parseInt(line));
                hashTable.add(value);
                lines--;
            }							
            out.println(hashTable);
        }
        catch(Exception e){
            System.out.println("Houston, we have a problem!");
        }  
        try(BufferedReader bR = new BufferedReader(new FileReader("words.dat"))){
            HashTable hashTable = new HashTable();		
            String line = "";
            int lines = Integer.parseInt(bR.readLine());
            while(lines > 0){
                line = bR.readLine();
                Word value = new Word(line);
                hashTable.add(value);
                lines--;
            }							
            out.println(hashTable);
        }
        catch(Exception e){
            System.out.println("Houston, we have a problem!");
        }  
    }
}
