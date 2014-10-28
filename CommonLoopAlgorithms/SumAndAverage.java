

import java.util.Scanner;

public class SumAndAverage
{
    /**
     * computes tge sum and average of the specified series of numbers.
     * Ian barnyard
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers, type 'q' to exit");
        
        double total = 0;
        int count = 0;
        double value;
        while( in.hasNextDouble())
        {
            value = in.nextDouble();
            total += value;
            count++;
        }
        double average = 0;
        if (count > 0)
        {
            average = total / count;
        }
        System.out.println("Total: " +total + "Average: " +average);
    }

}
