import static java.lang.System.*;
public class Runner
{
    public static void main(){
        BinaryTree left = new BinaryTree(12, new BinaryTree(7,null,null), new BinaryTree(13,null,null));
        BinaryTree right = new BinaryTree(18, null, new BinaryTree(22,null,null));
        BinaryTree root = new BinaryTree(15,left,right);
        
        out.println("in order traversal = "+root.inOrder());
        out.println("post order traversal = "+root.postOrder());
    }
}
