//creating the factorial of a number using loops

public class Factorial {
//    public static int calculateFactorial(int n) {
//        int factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        return factorial;
//    }
//
//    public static void main(String[] args) {
//        int number = 10;
//        int result = calculateFactorial(number);
//        System.out.println("Factorial of " + number + " is: " + result);
//    }


//factorial of a number using recursive function

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 3;
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}


