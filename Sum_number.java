public class Sum_number{
    public static void main (String args[]){
        int n=1234;
        int add=0;
      
        while(n>0){
            add=add+n%10;
            n=n/10;
            

            
        }
        System.out.print(add);
    }
}