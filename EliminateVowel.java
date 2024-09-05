// This program prints the consonant of a string by removing the vowel.
import java.util.*;
public class EliminateVowel 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=obj.nextLine(),st="";
        obj.close();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)!='A'&&s.charAt(i)!='a'&&s.charAt(i)!='E'&&s.charAt(i)!='e'&&s.charAt(i)!='I'&&s.charAt(i)!='i'&&s.charAt(i)!='O'&&s.charAt(i)!='o'&&s.charAt(i)!='U'&&s.charAt(i)!='u')||s.charAt(i)==' ')
            {
                st+=s.charAt(i);
            }    
        }
        System.out.println("String is :"+st);
    }   
}