/* This program takes an array of integers as input from the user 
 and prints the elements in an alternating order.
 first from the start, then from the end, and continues in this manner.*/
import java.util.*;
public class Alternate
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n=obj.nextInt(),i,j=0,k=n-1;
        int ar[]=new int[n];
        System.out.println("Enter the Array elemetns");
                for(i=0;i<n;i++)
            ar[i]=obj.nextInt();
        obj.close();
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.print(ar[j]+" ");
                j++;
            }
            else
            {
                System.out.print(ar[k]+" ");
                k--;
            }
        }
    }
}