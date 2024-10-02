/*
 * This program performs scalar multiplication on a square matrix.
 * 1. The user is prompted to input the size of the matrix (n x n).
 * 2. The user then inputs the elements of the matrix.
 * 3. The program asks for a scalar value (r), which will be used to multiply each element of the matrix.
 * 4. The matrix is then multiplied by the scalar value, and the result is printed. 
 * Example:
 * If the matrix is:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * And the scalar value is 2, the output will be:
 * 2 4 6
 * 8 10 12
 * 14 16 18
 */
import java.util.*;
public class MatrixScalarMultiplication 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=obj.nextInt(),i,j,r;
        int ar[][]=new int[n][n];
        System.out.println("Enter the Elements ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            ar[i][j]=obj.nextInt();
        }
        System.out.println("Enter the Number to multiply to the matrix :");
        r=obj.nextInt();
        for(i=0;i<n;i++)
        {

            for(j=0;j<n;j++)
            {
                ar[i][j]=ar[i][j]*r;    
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}