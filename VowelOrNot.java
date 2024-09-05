// Thos program checks whether agiven character is vowel or not.
import java.util.*;
public class VowelOrNot 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Character to check :");
        char c=obj.next().charAt(0),ch=c;
        obj.close();
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println(c+" is a vowel.");
        else
            System.out.println(c+" is not a vowel.");
    }
}