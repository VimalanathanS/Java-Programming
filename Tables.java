// This program prints the table of a number entered by the user until the specfic number of times.
import java.util.*;
public class Tables 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to print the table : ");
        int n=obj.nextInt(),i,l;
        System.out.println("Enter the number of times to print the table: ");
        l=obj.nextInt();
        obj.close();
        for(i=1;i<=l;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}