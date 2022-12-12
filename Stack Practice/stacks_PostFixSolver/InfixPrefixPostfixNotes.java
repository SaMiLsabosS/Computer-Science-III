package stacks_PostFixSolver;
public class InfixPrefixPostfixNotes
{
    // infix: 3 + 5 (The expression given)
    // adds all the numbers and operands to the stacks first before popping out the operands and variables
    // pre-fix: + 3 5
    // operand and then numbers. Division always goes in the front 
    // post-fix: 3 5 + 7 *
    // has one stack for numbers and operands 
    // on post-fix, it adds the 3 and 5 to the number stack, it detects the operand "+"
    // which pops the 3 and 5, and adding them together to get 8
    // it then adds 7 to the number stack, and then pops the numbers out and multiplies them due to the multiplication operand 
    // Another example:  2 7 + 1 2 + +
    // (2 + 7) Adds 2 and 7 to the number stack, and then removes them to add them due to the addition operand
    // (1 + 2) Adds 1 and 2 to the top of the number stack, and then removes the 1 & 2 to add those together due to the addition operand
    // (2 + 7) + (1 + 2) Removes the 9 and the 3 in the number stack to add them due to the addition operand
}
