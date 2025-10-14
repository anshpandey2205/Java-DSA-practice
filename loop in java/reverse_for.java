import java.util.*;
public class reverse_for {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int reverse = 0;
        for(;n!=0;){
            int lastdigit=n%10;
            reverse = (reverse*10)+lastdigit;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
