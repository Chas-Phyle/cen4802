import java.util.Scanner;

public class App {
    /**
     * Main method used for asking the user to input a number and the method will output the value associated in that position of the fibonacci sequence.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to calculate? Please input 45 or less for now, or simply type -1 to leave.");
        Scanner userInput = new Scanner(System.in);
        boolean error = false;
        int userChoiceInt = 0;
        do{
        String userChoice = userInput.nextLine();
        
        try{
            userChoiceInt = Integer.parseInt(userChoice);   //converting the user input into a int if it fails it asks again
            if(userChoiceInt == -1){
                System.exit(0);
            }
        }catch(Exception e){
            System.out.println("Please only input numbers!");
            userChoice = null;
            error = true;
        }
        }while(error);
        userInput.close();
        System.out.println("Calculating ");
        System.out.println("\n"+fibrecl(userChoiceInt));
}

/**
 * Recursive algorithm for computating nth position of the fibonacci sequence
 * @param numberOfSteps The nth postion the user would like to know of the fibonacci sequence.
 * @return The value associated with the nth postion of the fibonacci sequence.
 */


public static long fibrecl(int numberOfSteps) { // recersive
double n = numberOfSteps;
if (n == 0) {
    return 0;
} else if (n == 1) {
    return 1;
} else {
    return (fibrecl(numberOfSteps - 1) + fibrecl(numberOfSteps - 2));
}
}
}
