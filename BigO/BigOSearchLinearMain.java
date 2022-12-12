 import static java.lang.System.*;
 import java.util.Arrays;
 public class BigOSearchLinearMain
 {
     public static void main(){
        out.println("Binary Search"); 
        int[] bigO = new int[6];
        runBinaryTest(bigO, 10);
        runBinaryTest(bigO, 100);
        runBinaryTest(bigO, 1000);
        runBinaryTest(bigO, 10000);
        runBinaryTest(bigO, 100000);
        runBinaryTest(bigO, 1000000);
        out.println("\n\nLinear Search");
        runLinearTest(bigO, 10);
        runLinearTest(bigO, 100);
        runLinearTest(bigO, 1000);
     }
     public static void runBinaryTest(int[] bigO, int num){
        int[] test = makeTest(num);
        if(num<=1000)
           out.println("original array is: "+ Arrays.toString(test));
        out.println("searching for 10 random nums in a list of "+num);
        bigO = runTest(test, num);
        out.println("best: "+bigO[0]+", average: "+bigO[1]+", worst: "+bigO[2]);
     }
     public static void runLinearTest(int[] bigO, int num){
        int[] test = makeTest(num);
        out.println("original array is: "+Arrays.toString(test));
        out.println("searching for 10 random nums in a list of "+num);
        bigO = runTestTwo(test, num);
        out.println("best: "+bigO[0]+", average: "+bigO[1]+", worst: "+bigO[2]);
     }
     public static int[] makeTest(int num){
        int[] test = new int[num];
        for(int i = 0; i < num; i++)
           test[i] = (int)(Math.random()*num)+1;         
        return test;
     }
     public static int[] runTest(int[] test, int num){       
        int[] sorted = new int[3];
        int temp = 0;
        int best = Integer.MAX_VALUE;
        int worst = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < 10; i++){
           int search = (int) (Math.random()*num);
           temp = binarySearch(test, search, 0, num-1, 0);  
           if(temp < best)
             best = temp;
           if(temp > worst)
             worst = temp;
           sum += temp;
        }
        sorted[0] = best;
        sorted[1] = sum/10;
        sorted[2] = worst;
        return sorted; 
     }  
     public static int[] runTestTwo(int[] test, int num){
        int[] sorted = new int[3];
        int temp = 0;
        int best = Integer.MAX_VALUE;
        int worst = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < 10; i++){
           int search = (int) (Math.random()*num);
           temp = linearSearch(test, search, 0, num-1, 0);
           if(temp < best)
              best = temp;
           if(temp > worst)
              worst = temp;
           sum += temp;
        }
        sorted[0] = best;
        sorted[1] = sum/10;
        sorted[2] = worst;
        return sorted;
     }
     public static int binarySearch(int[] test, int search, int beg, int end, int comp){
        if(beg > end)
           return comp;        
        int mid = (beg+end)/2;
        if(test[mid] == search){
           comp++; 
           return comp;
        }
        if(search < test[mid]) 
           return binarySearch(test, search, beg, mid-1, comp+1);        
        return binarySearch(test, search, mid+1, end, comp+1);
     }
     public static int linearSearch(int[] test, int search, int beg, int end, int comp){
        if(beg > end)
          return comp;
        if(test[beg] == search){
          comp++; 
          return comp;
        }
        return linearSearch(test, search, beg+1, end, comp+1);
     }
 }