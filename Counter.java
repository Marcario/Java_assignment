
//java program to count the number of digits in a number.
public class Counter {

        public static void main(String[] args) {
            int number = 10204034; // The number you want to count digits for

            // Convert the number to a string
            String numberString = Integer.toString(number);

            // Calculate the length of the string
            int digitCount = numberString.length();

            System.out.println("Number of digits: " + digitCount);
        }
    }


