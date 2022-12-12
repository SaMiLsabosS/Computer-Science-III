import static java.lang.System.*;
public class BinaryTreeBasics
{
    public static void main(){
        BinaryTree left = new BinaryTree(80, new BinaryTree(70,null,null), new BinaryTree(85,null,null));
        BinaryTree right = new BinaryTree(100, new BinaryTree(98,null,null), new BinaryTree(120,null,null));
        BinaryTree root = new BinaryTree(90, left, right);
        
        out.println("IN ORDER\n"+root.inOrder()+"\n");
        out.println("PRE ORDER\n"+root.preOrder()+"\n");
        out.println("POST ORDER\n"+root.postOrder()+"\n");
        out.println("REVERSE ORDER\n"+root.revOrder()+"\n\n\n");
        
        out.println("Tree height is "+root.getHeight());
        out.println("Tree width is "+root.getWidth());
        out.println("Number of leaves is "+root.getNumLeaves());
        out.println("Number of nodes is "+root.getNumNodes());
        out.println("Number of levels is "+root.getNumLevels());
        out.println("Tree as a string "+root);
        if(root.isFull())
           out.println("The tree is full.");
        else
           out.println("The tree is not full.");
    }
}
