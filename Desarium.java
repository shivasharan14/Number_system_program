import java.lang.Math;
public class Desarium{
    public static void main (String args[]){
        int n=175;
        int temp =n;
        int sum=0;
        int len=String.valueOf(n).length();
        while (temp>0){
            int rem=temp%10;
            sum += Math.pow(rem,len);
            
            temp=temp/10;
            len=len-1;
            
            

        }
        if(sum==n){
            System.out.println("It is an Disarium number");
        }
        else{
            System.out.println("it is not disarium number");
        }

            
    }
}