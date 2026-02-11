import java.util.Scanner;

public class PrimeNumbers {


    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;

    
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start range: ");
        int start = sc.nextInt();

        System.out.print("Enter end range: ");
        int end = sc.nextInt();

        System.out.println("\nPrime Armstrong numbers are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isArmstrong(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}