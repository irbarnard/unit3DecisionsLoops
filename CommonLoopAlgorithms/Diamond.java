
import java.util.Scanner;
/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Side length: ");
        int length = in.nextInt();
        int num = 1;
        
        for(int i = 1; i <= (2* length)-1; i++)
        {
            for(int j = 1; j<= length ; j++)
            {
                System.out.print(" ");
            }
            for (num = 1; num<= 1; num++)
            {
               System.out.print("*");
            }
            num += 2;
            System.out.print("\n");
        }
    }
}
