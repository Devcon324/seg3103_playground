/**
 * The FizzBuzz class provides a method to determine the FizzBuzz value for a
 * given number.
 */
public class FizzBuzz {

    /**
     * Returns the FizzBuzz value for the given number.
     *
     * @param num the number to determine the FizzBuzz value for
     * @return the FizzBuzz value as a String
     */
    public static String fizzingBuzzing(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        // take the first argument from the command line and convert it to an integer
        int num = Integer.parseInt(args[0]);
        String result = FizzBuzz.fizzingBuzzing(num);
        System.out.println(result);
    }
}
