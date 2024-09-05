// This program swifts the string from the upper case to lower case.
import java.util.*;
public class LCCaseSwift 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string to swift the case :");
        String s=obj.nextLine().toLowerCase();
        obj.close();
        System.out.println("Lower Case String is :"+s);
    }
}