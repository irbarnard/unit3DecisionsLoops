

import java.util.Scanner;

public class FindFirstMatch
{
     /** computes teh first found match*/
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("ENTER a string. ");
       String str = in.nextLine();
       
       boolean found = false;
       int index = 0;
       while(!found && index < str.length())
       {
           char ch = str.charAt( index );
           if( ch == ' ')
           {
               found = true;
           }
           else
           {
               index++;
           }
       }
       if (found)
       {
           System.out.println("Index of first space: "+ index);
       }
       else
       {
           System.out.println("tell meh somthin useful");
       }
    }
}
