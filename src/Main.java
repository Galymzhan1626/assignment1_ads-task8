import java.util.Scanner;

public class Main {
    /**
     * This method checks if a given string consists only of digits.
     * It uses a regular expression to match a sequence of one or more digits.
     * @return boolean Returns true if the string is all digits, false otherwise
     */
    public static boolean isAllDigits(String s) {
        return s.matches("\\d++");
        // The regex "\\d++" matches one or more digits
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        // Scanner object to read user input
        String s= scan.nextLine();
        // Reads a line of input from the user
        boolean check=isAllDigits(s);
        // Checks if the input string is all digits
        if(check){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}