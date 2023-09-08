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
        return (number % 2 == 0) ? true : false;
    }

    // A method to check if the number is odd

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
}
