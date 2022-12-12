import java.util.Arrays;
public class MergeSort extends Sort
{
    public MergeSort(){
       super();
    }  
    public MergeSort(int[] list){
       super(list);
    }
    @Override 
    public void sortForward(){
       splitAndMerge(list, 0, list.length-1);       
    }
    @Override
    public void sortBackward(){
       splitAndMergeBackwards(list, 0, list.length-1);        
    }
    public void splitAndMerge(int[] list, int lowIndex, int highIndex){
       if(lowIndex == highIndex)
          return;
       else{
          int midIndex = (lowIndex + highIndex)/2;
          splitAndMerge(list, lowIndex, midIndex);
          splitAndMerge(list, midIndex+1, highIndex);
          merge(list, lowIndex, midIndex, highIndex);
       }          
    }
    public void merge(int[] list, int lowIndex, int midIndex, int highIndex){
       int[] temp = new int[highIndex - lowIndex + 1];
       int left = lowIndex, right = midIndex+1, tempIndex = 0;
       while(left <= midIndex && right <= highIndex){
          if(list[left] <= list[right]) {
             temp[tempIndex] = list[left];
             tempIndex++; 
             left++;
          }
          else {
             temp[tempIndex] = list[right];
             tempIndex++; 
             right++;
          }
          comp++;
       }
       while(left <= midIndex){
          temp[tempIndex] = list[left];
          tempIndex++; 
          left++;
       }
       while(right <= highIndex){
          temp[tempIndex] = list[right];
          tempIndex++; 
          right++;
       }
       for(left = lowIndex; left <= highIndex; left++) 
          list[left] = temp[left - lowIndex];       
    }
    public void splitAndMergeBackwards(int[] list, int lowIndex, int highIndex){
       if(lowIndex == highIndex)
          return;
       else{
          int midIndex = (lowIndex + highIndex)/2;
          splitAndMergeBackwards(list, lowIndex, midIndex);
          splitAndMergeBackwards(list, midIndex+1, highIndex);
          mergeBackwards(list, lowIndex, midIndex, highIndex);
       }          
    }
    public void mergeBackwards(int[] list, int lowIndex, int midIndex, int highIndex){
       int[] temp = new int[highIndex - lowIndex + 1];
       int left = lowIndex, right = midIndex+1, tempIndex = 0;
       while(left <= midIndex && right <= highIndex){
          if(list[left] >= list[right]){
             temp[tempIndex] = list[left];
             tempIndex++; 
             left++;
          }
          else{
             temp[tempIndex] = list[right];
             tempIndex++; 
             right++;
          }
          comp++;
       }
       while(left <= midIndex){
          temp[tempIndex] = list[left];
          tempIndex++; 
          left++;
       }
       while(right <= highIndex){
          temp[tempIndex] = list[right];
          tempIndex++; 
          right++;
       }
       for(left = lowIndex; left <= highIndex; left++) 
          list[left] = temp[left - lowIndex];       
    }
}
