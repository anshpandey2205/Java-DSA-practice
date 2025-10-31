public class practice_que_3 {
    public static void isPalindrome(int n){
        int lastdigit=0;
        int reverse=0;
        while(n>=0){
            lastdigit = n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
        }
        if(reverse==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[]args){
        System.out.println(isPalindrome(121));

    }
}
