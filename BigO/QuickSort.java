import java.util.Arrays;
public class QuickSort extends Sort
{
    public QuickSort(){
       super();
    }  
    public QuickSort(int[] list){
       super(list);
    }
    @Override 
    public void sortForward(){
       findPivot(list, 0, list.length-1);       
    }
    @Override
    public void sortBackward(){
       findPivotBackwards(list, 0, list.length-1);         
    }
    public void findPivot(int[] list, int low, int high){
       if(low >= high)
          return;
       else{
          int indexOfPivot = partition(list, low, high);
          findPivot(list,low,indexOfPivot-1);
          findPivot(list,indexOfPivot+1,high);
       }
    }
    public int partition(int[] list, int low, int high){
       int pivot = list[high];
       int indexOfPivot = low-1;
       for(int checker = low; checker < high; checker++){
          if(pivot > list[checker]){
             indexOfPivot++;
             int temp = list[indexOfPivot];
             list[indexOfPivot] = list[checker];
             list[checker] = temp;
          }
          comp++;
       }
       indexOfPivot++;
       int temp = list[indexOfPivot];
       list[indexOfPivot] = list[high];
       list[high] = temp;
       return indexOfPivot;
    }
    public void findPivotBackwards(int[] list, int low, int high){
       if(low >= high)
          return;
       else{
          int indexOfPivot = partitionBackwards(list, low, high);
          findPivotBackwards(list,low,indexOfPivot-1);
          findPivotBackwards(list,indexOfPivot+1,high);
       }
    }
    public int partitionBackwards(int[] list, int low, int high){
       int pivot = list[high];
       int indexOfPivot = low-1;
       for(int checker = low; checker < high; checker++){
          if(pivot < list[checker]){
             indexOfPivot++;
             int temp = list[indexOfPivot];
             list[indexOfPivot] = list[checker];
             list[checker] = temp;
          }
          comp++;
       }
       indexOfPivot++;
       int temp = list[indexOfPivot];
       list[indexOfPivot] = list[high];
       list[high] = temp;
       return indexOfPivot;
    }
}
