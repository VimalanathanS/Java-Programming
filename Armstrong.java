/*
 * This program checks whether a given number is an Armstrong number or not. 
 * An Armstrong number (also called a narcissistic number) is a number that is equal to 
 * the sum of its own digits, each raised to the power of the number of digits.
 */
import java.util.*;
public class Armstrong
{
   public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String s=obj.nextLine();
        int ld,l=s.length(),n=Integer.parseInt(s),sum=0;
        while(n>0)
        {
            ld=n%10;
            sum+=Math.pow(ld,l);
            n/=10;
        }
        if(sum==Integer.parseInt(s))
            System.out.println(s+" is a armstrong number.");
        else
            System.out.println(s+" is not a armstrong number.");

    }
}