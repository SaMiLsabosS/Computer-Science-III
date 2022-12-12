import java.util.Arrays;
public class SelectionSort extends Sort
{
    public SelectionSort(){
       super();
    } 
    public SelectionSort(int[] list){
       super(list);
    }
    @Override 
    public void sortForward(){
       comp = 0;
       for(int i = 0; i < list.length-1; i++){  
          int minIndex = i;
          for(int j = i+1; j < list.length; j++){
             if(list[j]<list[minIndex])
                minIndex = j;              
             comp++;
          }
          int temp = list[minIndex];
          list[minIndex] = list[i];
          list[i] = temp;           
          //System.out.println(Arrays.toString(list));
       } 
    }
    @Override
    public void sortBackward(){
       comp = 0;
       for(int i = list.length-1; i > 0; i--){  
          int maxIndex = i;
          for(int j = i-1; j > -1; j--){
             if(list[j]<list[maxIndex])
                maxIndex = j;              
             comp++;
          }
          int temp = list[maxIndex];
          list[maxIndex] = list[i];
          list[i] = temp;           
          //System.out.println(Arrays.toString(list));
       }  
    }
}
