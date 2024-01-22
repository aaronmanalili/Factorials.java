// Factorials

import java.util.Scanner; 

public class Factorials
{
	
public static void main(String[] args)
{
  @SuppressWarnings("resource")
  Scanner scan = new Scanner(System.in);
	
  double number;
  System.out.println("Enter in a nonnegative integer.");	
  number = scan.nextDouble();
  int count = 1;
  int i = 1;

  while(number < 0)
  {
	  if(number < 0)
	  {
		  System.out.println("You enter an integer that is negative.");
		  System.out.println("Enter in a nonnegative integer.");	
		  number = scan.nextDouble();
	  }
  }

  while(i <= number)
  {
    count = count * i;	
    i++;
  }

  System.out.println("The factorial of " + number + " is " + count);
	
}
}
