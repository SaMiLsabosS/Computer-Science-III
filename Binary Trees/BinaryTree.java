
public class BinaryTree
{
    public Object data;
    public BinaryTree left;
    public BinaryTree right;
    public BinaryTree(Object d, BinaryTree l, BinaryTree r){
        data = d;
        left = l;
        right = r;
    }

    public Object getData(){
        return data;
    }

    public BinaryTree getLeft(){
        return left;
    }

    public BinaryTree getRight(){
        return right;
    }

    public String preOrder(){
        String answer = data+" ";
        if(left != null)
            answer += left.preOrder();
        if(right != null)
            answer += right.preOrder();
        return answer;
    }

    public String postOrder(){
        String answer = "";
        if(left != null)
            answer += left.postOrder()+" ";
        if(right != null)
            answer += right.postOrder()+" ";
        return answer+data;
    }

    public String inOrder(){
        String answer = "";
        if(left != null)
            answer += left.inOrder();
        answer += data + " ";
        if(right != null)
            answer += right.inOrder();
        return answer;
    }

    public String revOrder(){
        String answer = "";
        if(right != null)
            answer += right.revOrder();
        answer += data + " ";
        if(left != null)
            answer += left.revOrder();
        return answer;
    }

    public int getNumLeaves(){ 
        int numLeaves = 0;
        if(left == null && right == null) // if left and right are null
            numLeaves++;
        if(left != null) // if left is null
            numLeaves += left.getNumLeaves();               
        if(right != null) // if right is null
            numLeaves += right.getNumLeaves();        
        return numLeaves;
    }

    public int getNumLevels(){
        return this.getHeight()+1;
    }

    public int getWidth(){// width of the left and right side added together plus the head node equals the total width
        int widthLeft = 0;
        int widthRight = 0;
        if(left != null){ // if left is null, then add width to the left and add the left's height 
            widthLeft++;
            widthLeft += left.getHeight();
        }
        if(right != null){ // if right is null, then add width to the right and add the right's height 
            widthRight++;
            widthRight += right.getHeight(); 
        }
        return widthLeft+widthRight+1; // add the left and right's widths and add one
    }

    public int getHeight(){
        int height = 0;
        int heightLeft = 0;
        int heightRight = 0;
        if(left != null){
            heightLeft++;
            heightLeft += left.getHeight();
        }
        if(right != null){
            heightRight++;
            heightRight += right.getHeight(); 
        }
        if(heightLeft > heightRight)
            height = heightLeft;
        else
            height = heightRight;
        return height;
    }

    public int getNumNodes(){
        int numOfNodes = 0; 
        if(left != null)
            numOfNodes += left.getNumNodes();       
        if(right != null)
            numOfNodes += right.getNumNodes();        
        return numOfNodes+1;
    }

    public String toString(){
        return inOrder();
    }

    public boolean isFull(){
        boolean leftFull = true;
        boolean rightFull = true;
        if(left != null)
            leftFull = left.isFull();
        if(right != null)
            rightFull = right.isFull();
        if((left != null && right == null) || (left == null && right != null))
            return false;
        else if(leftFull == true && rightFull == true)
            return true;
        return false;
    }
}
