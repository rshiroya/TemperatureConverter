 
/**
 * This driver will help the user to convert the two temperature types to favorable one.
 *
 * @author R. Shiroya
 * @version 01-23-2020
 */
import java.util.Scanner;   // to use the scanner to read the user's input
public class TemperatureDriver // public class name
{
    // one main method
    public static void main(String[] args)
    {
        Scanner in; // scanner 
        //variables
        double temp; // variable to hold the value of temperature
        char type; // variavble to hold the type of temperature scale
        double choice;  // variable to hold the choice of the user
        char goAgain;   // variable to hold the condition of while loop
        in = new Scanner(System.in); // new scanner object to read input from the keyboard
        Temperature myTemperature;  // operator to call for constructor
        System.out.print("Enter the temperature you want to convert: ");    // print statement
        temp = in.nextDouble(); // to read the input from user
        System.out.print("Enter the type of temperature c for celsius and f for fahrenheit: ");
        type = in.next().charAt(0);
        myTemperature = new Temperature(temp, type);    // call the constructor
        goAgain = 'y';  // condition of the loop
        System.out.print(myTemperature.toString());
        while(goAgain == 'y')   // loop
        {
            System.out.println("Enter the temperature you want to convert: ");
            temp = in.nextDouble();
            System.out.print("Enter the type of temperature c for celsius and f for fahrenheit: ");
            choice = in.next().charAt(0);   // read the user's input
            if(choice == 'c')   // if else statement for the two types of temperature.
            {
                
                myTemperature.setCelsius(temp);
            }
            else    
            {

                myTemperature.setFahrenheit(temp);
            }
            
            System.out.println(myTemperature.toString());
            
            System.out.print("Enter a y to change something else: "); 
            goAgain = in.next().charAt(0);
        }// end of while loop
        System.out.println("Have A sunny day.");
    } //end of main
} // end
