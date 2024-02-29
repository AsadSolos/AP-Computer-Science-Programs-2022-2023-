//******611472******
//*Name:Muhammad Khurram
//*Date: September 1st, 2022
//*LabName: Lab1TempCo
//*desc.: Program will convert any temperature type (Celsius, Farenheit, Kelvin) to any other type
import java.util.Scanner;
public class Lab1TempCo_MAK 
    {    
    public static void main(String args[]) 
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a temperature in Celsius.");
      double celsius = scan.nextDouble(); //Double for celsius input is created.
      
      System.out.println("Your input equals: " + (celsius * 9.0 / 5.0 + 32.0) + " in Farenheit."); //Celsius is converted to farenheit by using the formula.
      System.out.println("Your input equals: " + (celsius + 273.16) + " in Kelvin."); //Celsius is converted to kelvin. It's 273.16 instead of .15 because of it being changed
      
      System.out.println("Enter a temperature in Farenheit."); 
      double farenheit = scan.nextDouble(); //Double for farenheit is created
      
      System.out.println("Your input equals: " + ((farenheit - 32.0) * 5.0/9.0) + " in Celsius."); //Farenheit is converted to celsius. The inverse of the celsius to farenheit formula
      System.out.println("Your input equals: " + (((farenheit - 32.0) * 5.0/9.0) + 273.16) + " in Kelvin."); //Farenheit is converted to kelvin. Just the celsius conversion plus 273.16
      
      System.out.println("Enter a temperature in Kelvin.");
      double kelvin = scan.nextDouble(); //Double for kelvin is created
      
      System.out.println("Your input equals: " + (kelvin - 273.16) + " in Celsius."); //Kelvin is converted to celsius, so subtracted by 273.16
      System.out.println("Your input equals: " + (((kelvin - 273.16)) * 9.0/5.0 + 32.0) + " in Farenheit."); //Kelvin is converted to farenheit. It's just K -> C -> F.
    }
}