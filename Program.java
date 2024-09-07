//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    public static void main (String[] args){
    Scanner myScanner = new Scanner(System.in);
    int num1= 0;
    int num2= 0;
    
    //ask for input
    System.out.println("Enter number 1: ");
    num1 = myScanner.nextInt();
    System.out.println("Enter number 2: ");
    num2 = myScanner.nextInt();
    
    //calculations
    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1*num2;
    double avg= (num1+num2)/2.0;
    int dist= Math.abs(difference);
    int max = (num1+num2+Math.abs(difference))/2;
    int min = (num1+num2-Math.abs(difference))/2;    
    
    //output
    System.out.println("Sum= "+sum);
    System.out.println("Difference= "+difference);
    System.out.println("Product= "+ product);
    System.out.println("Average= "+avg);
    System.out.println("Absolute value= "+dist);
    System.out.println("Maximum= "+max);
    System.out.println("Minimum= "+min);
    
    
}
}
//Paste console output below:
/*
Enter number 1: 
13
Enter number 2: 
20
Sum= 33
Difference= -7
Product= 260
Average= 16.5
Absolute value= 7
Maximum= 20
Minimum= 13

*/
