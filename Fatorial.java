import java.util.Scanner;
public class Fatorial {
    public static void main (String args[]){
        Scanner tm=new Scanner(System.in);
        System.out.println("enter a number");
        int z=tm.nextInt();
        int fact =1;
        for(int i=1;i<=z;i++){
            fact=fact*i;
        }
        System.out.println("factorial is"+fact);
    }
}