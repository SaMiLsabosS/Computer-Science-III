
public class QuickSortNotes
{
    public static void main(){
        // Splits a list into two which has > and < the pivot which is the middle of the list
        // Splits until list is size 1
        // Once the list is size 1, then the list is paritally sorted
        // Basically tons of sorting
        // the first or last number is favorable
        // create two variables 
        // (boolean check which a variable that checks if it's less than pivot) 
        // (swapInto keeps track of the location of where I should be swapping into. increases until 
        // qs(arr, 0, 7)
        //  pivot = partition(arr, 0, 7)
        //   qs(arr, start, pivot-1)
        //   qs(arr, pivot+1, end)
        //  if(start > end)
        //  qs(arr, 0, -1)
        //  qs(arr, 1, 2)
        // do this recursively 
    }
}
