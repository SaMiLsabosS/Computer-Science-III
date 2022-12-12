
public class Notes
{
    // No duplicates
    // Use compareTo();
    // Minimum Number: Keep going left until null
    // Maximum Number: Keep going right until null
    // Add: Check the node if it's less than or greater than, add the node to the left if it's less than and to the right if it's more than
    // Delete: Check left and right if it's null, if there's only one null then reference the previous node of deletion to the moving node
    // If it's complicated, take the minimum number on the right, which when going to the right you go the leftmost node
    // That minimum number needs to have the same properties as the deleted node 
    // Anything linked to the moving node will move to the right node of the deleted node
}
