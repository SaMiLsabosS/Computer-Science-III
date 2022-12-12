import java.util.Arrays;
public class InsertionSort extends Sort
{
    public InsertionSort(){
        super();
    }  
    public InsertionSort(int[] list){
        super(list);
    }
    @Override 
    public void sortForward(){
       for(int i = 1; i < list.length; i++){ 
          int numToBeg = i;
          int compareIndex = i-1;
          boolean finishComparing = false;
          while(!finishComparing){
             if(compareIndex == -1)
                finishComparing = true;
             else if(list[numToBeg] < list[compareIndex]){
                int temp = list[numToBeg];
                list[numToBeg] = list[compareIndex];
                list[compareIndex] = temp;
                numToBeg--;
                compareIndex--;
             } 
             else
                finishComparing = true;
             comp++;
          }
          //System.out.println(Arrays.toString(list));
       }
    }
    @Override
    public void sortBackward(){
       for(int i = list.length-1; i > 0; i--){ 
          int numToEnd = i;
          int compareIndex = i-1;
          boolean finishComparing = false;
          while(!finishComparing){
             if(numToEnd == list.length)
                finishComparing = true;
             else if(list[numToEnd] > list[compareIndex]){
                int temp = list[numToEnd];
                list[numToEnd] = list[compareIndex];
                list[compareIndex] = temp;
                numToEnd++;
                compareIndex++;
             } 
             else
                finishComparing = true;
             comp++;
          }
          //System.out.println(Arrays.toString(list));
       }        
    }
}
