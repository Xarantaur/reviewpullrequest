public class BadlyWrittenClass {
    private int number;

    // Constructor with multiple parameters
    public BadlyWrittenClass(int n) {
        number = n;
    }

    // Get the number
    public int getNumber() {
        return number;
    }

    // A method to check if the number is even
    public boolean isEven() {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    // A method to check if the number is odd
    public boolean isOdd() {
        if (number % 2 != 0)
            return true;
        else
            return false;
    }

    // A method to check if the number is prime
    public boolean isPrime() {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // A method to calculate the factorial of the number
    public int calculateFactorial() {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // A method to print a random message
    public void printRandomMessage() {
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    // A method to perform a completely unrelated task
    public String doSomethingUnrelated() {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        return "The sum of numbers from 0 to " + number + " is " + sum;
    }
}