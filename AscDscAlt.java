/*
 * This program prints numbers in an alternating ascending and descending order.
 * - The user inputs a number 'n'.
 * - The program then prints pairs of numbers: the first number from 1 upwards (ascending),
     and the second number from 'n' downwards (descending), in an alternating sequence.
 * - The process continues until the descending number reaches 1 and the ascending number reaches 'n'.
 * Example:If the input is 5, the output will be: 1 5 2 4 3 3 4 2 5 1
 */
import java.util.*;
public class AscDscAlt 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=obj.nextInt(),i=1;
        obj.close();
        while(n>0)
        {
            System.out.print(i+" "+n+" ");
            n--;
            i++;
        }
    }
}