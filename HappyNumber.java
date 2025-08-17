import java.util.Scanner;

class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum, digit;

        while (n != 1 && n != 4) {
            sum = 0;
            while (n > 0) {
                digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}
