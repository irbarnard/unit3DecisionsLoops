
import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class SwapLetters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("word: ");
        String newWord = in.next();
        int z = newWord.length()-1;
        for(int i = 0; i <= newWord.length()-1; i++)
        {
            Random letter = new Random();
            int b = letter.nextInt(z);
            int j = letter.nextInt(z-b)+(b+1);
            String first = newWord.substring(0, b);
            String middle = newWord.substring(b+1, j);
            String last = newWord.substring(j+1, z+1);
            System.out.println(first + newWord.charAt(j) + middle + newWord.charAt(b) + last);
        }
        
    }
}
