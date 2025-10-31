import java.util.*;
public class prime_function {
    public static int isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }
            else{
                System.out.println("prime");
                break;
            }
        }
        return n;
    }
    public static void main(String[]args){
        System.out.println(isprime(8));

    }
}
