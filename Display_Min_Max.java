//Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered


import java.util.Scanner;

public class Display_Min_Max
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > max)
            {
                max = number;
            }
            
            if(number < min)
            {
                min = number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }  
}