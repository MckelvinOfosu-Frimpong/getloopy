import java.util.Scanner;

public class CtoF {

    public static void main(String[] args) {
        double cValue = 0;
        double fValue;
        String trash = " ";
        boolean done = false ;

        Scanner console = new Scanner(System.in);


        System.out.print("Please input your Celsius value to convert to Fahrenheit: ");
        do {
            if (console.hasNextDouble())
            {
                cValue = console.nextDouble();
                console.nextLine();
                done = true;
            }
            else
            {
                trash = console.nextLine();
                System.out.print("Invalid input: " + trash + " type correct a input: ");
            }
        } while(!done);

        fValue = ((cValue * 1.8) + 32);

        System.out.println("Your temperature in Fahrenheit is: " + fValue + "° F");

        if (fValue >= 120)
        {
            System.out.println("Your temperature is at (or above) boiling point");
        }
        else if (fValue <= 32)
        {
            System.out.println("Your temperature is at (or below) freezing point");
        }
        else
        {
            System.out.println("Your temperature is neither freezing nor boiling");
        }

    }
}

