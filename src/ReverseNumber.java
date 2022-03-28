import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = n.nextInt();
        reverseNumber(num);
    }

    static void reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The Reverse of given number is " + rev);
    }
}