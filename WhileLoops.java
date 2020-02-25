/**
 * While loop program
 * Iterates over some basic code until the while condition is no longer true
 *
 */
public class WhileLoops {

    /**
     * @param args String
     */
    public static void  main(String args[])
    {
        int counter = 0;

        // while() will run in a loop until the condition is no longer true
        // I.e counter is less than 100
        while( counter < 100 ) {
            // display the value of counter
            System.out.println(counter);

            // ++ will increment counter.
            // This line is the same as: counter = counter + 1;
            // Just a nice short hand version :) 
            counter++;
        }
    }
}