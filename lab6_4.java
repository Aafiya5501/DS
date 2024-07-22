import java.util.Scanner;

public class lab6_4 {


    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.print("Enter the scale (C for Celsius, F for Fahrenheit): ");
        char scale = scanner.nextLine().charAt(0);
        
       
        if (scale == 'C' || scale == 'c') {
            
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else if (scale == 'F' || scale == 'f') {
         
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
        } else {
            System.out.println("Invalid input. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

        // Close the scanner
        scanner.close();
    }
}
