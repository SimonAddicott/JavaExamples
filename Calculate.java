import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Calculation program
 * Takes 2 input values & 1 operator value from the user & runs a calculation
 *
 * Runtime output:
 *
 * Calculator Program
 * ------------------
 *
 * Please enter first numeric value:
 * 10
 * Please enter second numeric value:
 * 67
 * 10 + 67 = 77
 *
 * Process finished with exit code 0
 *
 */
public class Calculate {

    /**
     * @param args String
     */
    public static void  main(String args[])
    {
        // Define an input stream
        InputStreamReader read = new InputStreamReader(System.in);
        // Define a buffer to read in the stream
        BufferedReader in = new BufferedReader(read);

        // Display the program header
        System.out.println("Calculator Program");
        System.out.println("------------------");
        System.out.println("");

        try {
            // Tell user to enter input
            System.out.println("Please enter first numeric value: ");
            // Read in user input, convert to an integer
            int firstValue = Integer.parseInt(in.readLine());

            // Tell user to enter input
            System.out.println("Please enter second numeric value: ");
            // Read in user input, convert to an integer
            int secondValue = Integer.parseInt(in.readLine());

            // Perform the calculation
            int result = firstValue + secondValue;

            // Make the resultDisplay to show the user
            String resultDisplay = firstValue + " + " + secondValue + " = " + result;

            // Display the resultDisplay String
            System.out.println(resultDisplay);

        } catch (Exception e) {
            System.out.println("Whoops! Something went wrong...");
            System.out.println(e.getMessage());
        }
    }

}