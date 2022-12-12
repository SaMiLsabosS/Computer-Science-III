import static java.lang.System.*;
public class Runner
{
    public static void main(){
        Comparable[] arr1 = {23,7,50,8,9,90,5,7,9,67,6345,1,324};
        Comparable[] arr2 = {2811, 2661, 836, 259, 2016, 3259, 1739, 4923, 587, 1693, 1447, 4235, 69};
        Comparable[] arr3 = {1750, 1389, 557, 2489, 2329, 2893, 610, 2747, 208, 4969, 1888, 2467, 5428};
        Comparable[] arr4 = {2651, 3012, 4308, 4595, 3212, 205, 4578, 159, 5784, 5382, 3280, 5016, 307};
        
        BST bst1 = new BST();
        BST bst2 = new BST();
        BST bst3 = new BST();
        BST bst4 = new BST();
        
        bst1.build_tree(arr1);
        bst2.build_tree(arr2);
        bst3.build_tree(arr3);
        bst4.build_tree(arr4);
        
        out.println(bst1.inOrder());
        out.println(bst2.inOrder());
        out.println(bst3.inOrder());
        out.println(bst4.inOrder());
    }
}
