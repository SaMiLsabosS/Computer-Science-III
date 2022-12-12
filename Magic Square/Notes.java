
public class Notes
{
    // n by n matrice that its sum of all the columns, rows and diagonals all equal 15
    // translations way 
    // there's a formula
    // and then you have to figure out where to put the numbers
    // calclate magic number first
    // then look at the rows or columns first
    // you could also do it the other way
    
    // the hard way is doign a 6x6 matrice 
    // look at the link 
    // formula: n(n^2+1)/2
    
    // first you have to place number 1 (n/2, n-1), n equals the matrice dimensions
    // after that take the position of number 1 and go to (i-1, j+1)
    // if the clumn doesn't exist then wrap it around
    // if number already exists then go to (i+1, j-2)
    // if calculated row position is -1 then go to (0, n-2)
    
    // no recursion
}
