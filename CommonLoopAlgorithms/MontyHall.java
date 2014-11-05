import java.util.Random;

public class MontyHall
{
public static void main(String[] args)
{
int i = 1;
int player = 0;
int car = 0;
int host = 0;
int original = 0;
int switching = 0;
Random generator = new Random();
while (i <= 1000) 
{
player = generator.nextInt(3)+1;
car = generator.nextInt(3)+1;
host = generator.nextInt(3)+1;
if (host == car || host == player) 
{
do
{
host = generator.nextInt(3)+1;
} while (host == car || host == player);
}
if (car == player) 
{
original += 1;
}
else 
{
switching += 1;
}
++i;
}
System.out.println("Original: " + original + "\nSwitched: " + switching);
}
}