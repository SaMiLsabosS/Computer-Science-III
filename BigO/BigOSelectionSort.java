import static java.lang.System.*;
import java.util.Arrays;
public class BigOSelectionSort
{
    public static void main(){
       int[] arr = {9, 8, 10, 5, 4, 10, 2, 2, 7, 8};
       int[] comp = new int[1];
       comp[0] = 0;
       out.println("original: "+Arrays.toString(arr));
       for(int i = 0; i < arr.length-1; i++){  
          int minIndex = i;
          for(int j = i+1; j < arr.length; j++){
             if(arr[j]<arr[minIndex])
                minIndex = j;              
             comp[0]++;
          }
          int temp = arr[minIndex];
          arr[minIndex] = arr[i];
          arr[i] = temp;           
          //out.println(Arrays.toString(list));
       } 
       out.println("comparisons: "+comp[0]);
       out.println("sorted: "+Arrays.toString(arr)+"\n");
       comp[0] = 0;
       forwardAndReverse();
    }
    public static void sort(int[] list, int[] comp, boolean original){
       if(original){
          for(int i = 0; i < list.length-1; i++){  
             int minIndex = i;
             for(int j = i+1; j < list.length; j++){
                if(list[j]<list[minIndex])
                   minIndex = j;              
                comp[0]++;
             }
             int temp = list[minIndex];
             list[minIndex] = list[i];
             list[i] = temp;           
             //out.println(Arrays.toString(list));
          } 
       }
       else{
          for(int i = list.length-1; i > 0; i--){  
             int maxIndex = i;
             for(int j = i-1; j > -1; j--){
                if(list[j]<list[maxIndex])
                   maxIndex = j;              
                comp[0]++;
             }
             int temp = list[maxIndex];
             list[maxIndex] = list[i];
             list[i] = temp;           
             //out.println(Arrays.toString(list));
          }           
       }   
    }
    public static void forwardAndReverse(){
       int[] arr = new int[10];
       for(int i = 0; i < 10; i++)
          arr[i] = (int) (Math.random()*10);
       int[] comp = new int[1];
       comp[0] = 0;
       sort(arr, comp, true);       
       out.println("sorted is: "+Arrays.toString(arr)+"\ncomparisons = "+comp[0]+"\n");
       comp[0] = 0;
       sort(arr, comp, false);
       out.println("reverse is: "+Arrays.toString(arr)+"\ncomparisons = "+comp[0]+"\n");
    }
}
