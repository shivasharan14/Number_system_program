import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        Scanner d = new Scanner(System.in);
        System.out.println("enter your number");
        int t=d.nextInt();
        
        int count=0;
        for(int i=1;i<=t;i++){
            if(t%i==0){
             count++;
            }
            
        }
        if(count==2){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
    }
}