// This program checks whether the given number is palinfrome number or not.
import java.util.*;
public class PalindromeNumber 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int ld,sum=0,n=obj.nextInt(),s=1;
        obj.close();
        while(n>0)
        {
            ld=n%10;
            n/=10;
            s=ld+s*10;
            sum+=s;
        }
        System.out.println(sum);
    }
}
