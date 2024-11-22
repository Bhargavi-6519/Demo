public class Prime {
    public static void main(String[] args) {
        int number = 29; // You can change this to any number
        boolean isPrime = true;

        // Check if number is less than 2, which is not prime
        if (number <= 1) {
            isPrime = false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
