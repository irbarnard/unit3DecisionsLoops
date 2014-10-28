import java.util.Scanner;

public class CompareAdjacent
{
    /**
     * Detects duplicates  
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please input numbers yo");
        double prevValue = in.nextDouble();
        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            if( value == prevValue)
            {
                System.out.println("Duplicate number");
            }
            prevValue = value;
        }
    }

}
