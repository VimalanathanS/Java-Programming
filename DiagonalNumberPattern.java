/**
 * This program prints a square grid of size 'n', where:
 * - Numbers are printed on the diagonal (from top-left to bottom-right), starting from 1.
 * - Letters are printed in all other positions, starting from 'a'.
 * 
 * The user is prompted to input the size of the grid (n). The program then prints
 * 'n' rows and 'n' columns, placing the increasing numbers on the diagonal 
 * and incrementing characters in the rest of the grid. Both the number and 
 * the character increase with each position.
 * 
 * Example:
 * For n = 3, the output will be:
 * 1 b c
 * d 2 f
 * g h 3
 */
import java.util.*;
public class DiagonalNumberPattern
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size :");
        int n=obj.nextInt(),k=1;
        obj.close();
        char ch='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                    System.out.print(k+" ");
                else
                    System.out.print(ch+" ");
                k++;
                ch++;
            }
            System.out.println();
        }
    }   
}