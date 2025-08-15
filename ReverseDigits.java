public class ReverseDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.print("Digits in reverse: ");
        while (n > 0) {
            System.out.print(n % 10 + " ");
            n = n / 10;
        }
    }
}