// This program prints the odd and even elements of array.
import java.util.*;
public class SumOfOddandEven 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int n=obj.nextInt(),i,os=0,es=0,ar[]=new int[n];
        System.out.println("Enter the Array elements :");
        for(i=0;i<n;i++)
        {
            ar[i]=obj.nextInt();
            if(ar[i]%2==0)
                es+=ar[i];
            else
                os+=ar[i];
        }
        obj.close();
        System.out.println("Odd Element Sum :"+os);
        System.out.println("Even Element Sum :"+es);         
    }
}