/*
 * This program checks whether the entered password is strong or not.
 * A password is considered "strong" if it contains at least one:
 * - Uppercase letter
 * - Lowercase letter
 * - Number
 * - Special character
 * The program counts occurrences of each type of character in the password
 * and prints "The password is strong" if all conditions are met; otherwise, 
 * it prints "The password is not strong".
 */
import java.util.*;
public class Password
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the password to check whether yor password is Strong or not :");
        String s=obj.nextLine();
        int i,uc=0,lc=0,nc=0,sc=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                uc++;
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                lc++;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
                nc++;
            else 
                sc++;
        }
        if(uc!=0 && lc!=0 && nc!=0 && sc!=0)
            System.out.println("The password is strong");
        else
            System.out.println("The password is not strong");
    }   
}