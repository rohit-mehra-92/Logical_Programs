import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int sum = perfectNum(num);

        if (sum == num) {
            System.out.println("This is perfect number");
        } else
            System.out.println("This is not perfect number");
    }

    static int perfectNum(int num) {
        int sum = 0;
        for (int i = 1; i < num / 2; i++) {
            if (num % i == 0) ;
            sum += i;
        }
        return sum;
    }

}
