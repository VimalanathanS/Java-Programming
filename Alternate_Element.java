// The following program prints the alternate elements of an array
import java.util.*;
public class Alternate_Element
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array Size");
        int n=obj.nextInt(),i,ar[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
            ar[i]=obj.nextInt();
        obj.close();
        System.out.println("The Alternate elements of the array are: \n");
        for(i=0;i<n;i+=2)
            System.out.print(ar[i]+" ");
    }
}