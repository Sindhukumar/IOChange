 import java.util.Scanner;

public class AskingQuestions 
{ 
  public static void main( String[] args ) 
  { 
    Scanner keyboard = new Scanner(System.in);

    Double num1, num2, num3;

    System.out.print( "First temperature? " );
    num1 = keyboard.nextDouble();

    System.out.print( "Second temperature? " );
    num2 = keyboard.nextDouble();

    System.out.println("The Average value is : " + (num1+num2)/2);
  }
}