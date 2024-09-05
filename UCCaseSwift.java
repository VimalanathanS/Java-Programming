// This program swifts the string from the lower case to upper case.
import java.util.*;
public class UCCaseSwift 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string to swift the case :");
        String s=obj.nextLine().toUpperCase();
        obj.close();
        System.out.println("Upper Case String is :"+s);
    }
}