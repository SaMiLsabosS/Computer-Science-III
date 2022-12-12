import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
public class HashTable
{
    private ArrayList[] table;
    public HashTable(){
        table = new ArrayList[10];
        for(int i = 0; i < table.length; i++)
            table[i] = new ArrayList();
    }

    public void add(Object obj){
        int num = obj.hashCode();
        if(!table[num].contains(obj))
            table[num].add(obj);     
    }

    public String toString(){
        String output="HASHTABLE\n";
        for(int i = 0; i < table.length; i++){
            output += "bucket "+i+" ";
            for(int j = 0; j < table[i].size(); j++)
                output += table[i].get(j)+" ";             
            output += "\n";
        }
        return output;
    }
}