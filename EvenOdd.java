import java.util.Scanner;
class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n % 2 == 0)
            System.out.println("It is an Even");
        else
            System.out.println("It is an Odd");
    }
}
