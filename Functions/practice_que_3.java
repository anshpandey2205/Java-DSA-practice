public class practice_que_3 {
    public static void isPalindrome(int n){
        int original = n;
        int reverse = 0;

        while(n > 0){
            int lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n = n / 10;
        }

        if(reverse == original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome(121);   // ✔️ Just call directly
    }
}

