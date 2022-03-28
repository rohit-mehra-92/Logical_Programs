import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        primeNumber(num);
    }

    static void primeNumber(int num) {
        if (num == 0 || num == 1) {
            System.out.println("This is  not prime number");
        } else {
            boolean prime = true;
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("This is not Prime number");
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                System.out.println("This is Prime number");
            }
        }
    }
}