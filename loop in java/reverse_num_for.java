import java.util.*;
public class reverse_num_for {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(;n!=0; ){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}
