public class Palindrome{
    public static void main (String args[] ){
        String s1="madam";
        String rev="";
        for(int i=s1.length()-1;i>0;i--){
         rev=rev+s1.charAt(i);

        }
        if(rev.equalsIgnoreCase(rev)){
            System.out.println("it is an palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}