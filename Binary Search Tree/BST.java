
public class BST
{
    BST left, right;
    Comparable data;
    public BST(){
        data = null;
        left = null;
        right = null;
    }

    public BST(Comparable n){
        data = n;
        left = null;
        right = null;
    }

    //     public BST(Comparable n, BST l){
    //         data = n;
    //         left = l;
    //         right = null;
    //     }
    //     
    //     public BST(BST r. Comparable n){
    //         data = n;
    //         left = null;
    //         right = r;
    //     }

    public void build_tree(Comparable[] list){
        for(Comparable bit : list)         
            this.add(this, bit);           
    }

    public void add(BST tree, Comparable bit){ 
        if(bit.equals(data)) // duplicate exception
            return;
        else if(tree.data.equals(null)) // no root exception 
            tree = new BST(data);        
        if(bit.compareTo(data) < 0){ // left
            if(left.data.equals(null))
                left.data = bit;
            add(left, bit);
        }
        else{ // right
            if(right.data.equals(null))
                right.data = bit;
            add(right, bit);
        }           
    }

    //     public void add(Comparable data){
    //         root = addRecursive(root, data);
    //     }

    //     public BST addRecursive(BST root, Comparable data){
    //         if(root == null){
    //             root = new BST(data);
    //             return root;
    //         }
    //         if(data < root.data){
    //             if(left == null)
    //                 left.data = data;
    //             left = addRecursive(left, data);
    //         }
    //         else{
    //             if(right == null)
    //                 right.data = data;
    //             right = addRecursive(right, data);
    //         }           
    //         return root;
    //     }

    public BST find(BST tree, Comparable bit){
        if(tree == null || bit.compareTo(data) == 0)
            return tree;
        if(bit.compareTo(data) > 0)
            return tree.find(tree.right, data);
        return tree.find(tree.left, data);
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
    
    public BST getMin(BST tree){
        while(tree.left != null)
            tree = tree.left;   
        return tree;
    }

    public BST getMax(BST tree){
        while(tree.right != null)
            tree = tree.right;       
        return tree;
    }

    public void deleteMin(BST tree){
        if(tree.left == null){ // head node exception
           BST temp = tree.right.getMin(tree).right;
           if(temp.data.equals(tree.right.data))
              temp = tree.right.right;
           tree = tree.right.getMin(tree);          
        }
//         while(root.left.left != null)
//             root = root.left;       
//         root.left = null;
    }
// 
//     public void deleteMax(BST tree){
//         while(root.right.right != null)
//             root = root.right;        
//         root.right = null;
//     }
// 
//     public void delete(BST tree, Comparable bit){
//         if(tree.left == null && tree.right != null){
//             while(tree.right != null){
//                 if(bit.compareTo(tree.data) == 0) 
//                    ;
//                 tree = tree.right;  
//             }
//         }
//         else if (tree.left != null && tree.right == null){
//            
//         }
//         else
//            root = null;
//     }
}
