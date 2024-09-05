// This program prints the greatest amoung three numbers.
import java.util.*;
public class GreatestAmongThree 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int n1=obj.nextInt();
        System.out.println("Enter Number 2 :");
        int n2=obj.nextInt();
        System.out.println("Enter Number 3 :");
        int n3=obj.nextInt();
        obj.close();
        if(n1>n2 && n1>n3)
            System.out.println(n1+" is greatest number");
        else if(n2>n1 && n2>n3)
            System.out.println(n2+" is greatest number");
        else
            System.out.println(n3+" is greatest number");        
    }
}