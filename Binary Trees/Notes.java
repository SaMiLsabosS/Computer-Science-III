/*
 * Notes: 
 * Top of the tree is the root
 * The bottom of the tree are the leafs
 * 
 * Tree Traversals:
 * InOrder(Tree)
 *   InOrder(Left) 
 *   print Node
 *   InOrder(Right)
 * PreOrder(Tree)
 *   Print Node
 *   PreOrder(Left)
 *   PreOrder(Right)
 * PostOrder(Tree)
 *   PostOrder(Left)
 *   PostOrder(Right)
 *   Print Node
 * RevOrder(Tree) 
 *   InOrder(Right) 
 *   print Node
 *   InOrder(Left)
 * 
 * Processing Tree Nodes:
 * Width: The longest path that you can take from a random origin to a destination (Collect the amount of levels that exist on both sides of the root and continuing down the tree)
 * NumLeaves: Return one when both sides of the leaf are null
 * NumNodes: The amount of nodes that exist in the binary tree 
 * Height: Number of possible connections (Simple Recursion method)
 * NumLevels: (Levels start from zero | Total is 4 levels but you can only access up to the 3rd level)
 * IsFull: When each node is either a leaf or possess exactly two child nodes
 * IsComplete: Each level has the maximum number of nodes except for the last level and everything needs to be shifted to the left
 * You have to look at trees from 4-7 nodes on a 3-level tree for it to possibly be complete
 * If the one side is full and the other is not full (check for the node to be on the left side)
 * Create a method for the biased left scenario when solving for complete
 * Method:
 * No children
 * Either/Or
 * Complete
 */
public class Notes
{
    
}
