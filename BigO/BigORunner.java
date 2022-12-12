import static java.lang.System.*;
import java.util.Arrays;
public class BigORunner
{
   public static void main(){
       Sort[] listOfSorts = {new SelectionSort(), new InsertionSort(), new MergeSort(), new QuickSort()};
       String[] sortNames = {"selection","insertion","merge","quick"};
       for(int i = 0; i < listOfSorts.length; i++){
          int[] arr = {9, 8, 10, 5, 4, 10, 2, 2, 7, 8};
          out.println(sortNames[i]+" sort: ");
          Sort sort = listOfSorts[i];
          sort.list = arr;
          out.println("original: "+Arrays.toString(arr));
          sort.sortForward();
          out.println("comparisons: "+sort.comp);
          out.println("sorted: "+Arrays.toString(sort.list)+"\n");
          Sort sortTwo = listOfSorts[i];
          sortTwo.list = makeList(10);
          sortTwo.sortForward();
          out.println("sorted is: "+Arrays.toString(sortTwo.list));
          out.println("comparisons = "+sortTwo.comp+"\n");
          sortTwo.sortBackward();
          out.println("reverse is: "+Arrays.toString(sortTwo.list));
          out.println("comparisons = "+sortTwo.comp+"\n");
          trials(sortNames[i]);
          out.println();
       }       
   }
   public static void trials(String sort){
       int[] listOfN = {10,100,1000};
       for(int i = 0; i < listOfN.length; i++){
          int best = Integer.MAX_VALUE;
          int worst = Integer.MIN_VALUE;
          int temp, sum = 0;
          double log = listOfN[i]*(Math.log(listOfN[i])/Math.log(2));
          if((log) - ((int) (log)) >= .5)
             log++;
          int logNum = (int) (log); 
          int squared = (int) (Math.pow(listOfN[i], 2));
          int[] bestAverageWorst = new int[3];
          out.println("sorting 10 lists of n = "+listOfN[i]);
          for(int listNum = 0; listNum < listOfN[i]; listNum++){
              Sort rand = new Sort();
              if(sort.equals("selection"))
                 rand = new SelectionSort(makeList(listOfN[i]));
              else if(sort.equals("insertion"))
                 rand = new InsertionSort(makeList(listOfN[i]));
              else if(sort.equals("merge"))
                 rand = new MergeSort(makeList(listOfN[i]));
              else 
                 rand = new QuickSort(makeList(listOfN[i]));
              rand.sortForward();
              temp = rand.comp;
              if(temp < best)
                 best = temp;
              if(temp > worst)
                 worst = temp;
              sum += temp;
          }
          bestAverageWorst[0] = best;
          bestAverageWorst[1] = sum/listOfN[i];
          bestAverageWorst[2] = worst;
          out.println("best: "+bestAverageWorst[0]+", average: "+bestAverageWorst[1]+", worst: "+bestAverageWorst[2]);
          out.println("nlog2n = "+logNum+"\tn^2 = "+squared+"\n");                    
       }
   }
   public static int[] makeList(int num){
       int[] arr = new int[num];
       for(int i = 0; i < num; i++)
          arr[i] = (int) (Math.random()*num)+1;
       return arr;
   }    
}
