import java.util.Scanner;
public class Armstrong{
    public static void main (String args[]){
        Scanner tm=new Scanner(System.in);
        System.out.println("enter your number");
        int z=tm.nextInt();
        int s=z;
        int sum =0;
        while (z>0) 
            
        {
            int rem=z%10;
            sum =sum+(rem*rem*rem);
            z=z/10;

        }
        if(sum==s){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("It is not armstrong number");
        }

        
    }
}