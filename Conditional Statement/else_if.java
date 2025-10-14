import java.util.*;
public class else_if {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("ADULT");
        }else if(age<13 || age<=17){
            System.out.println("TEENAGERS");
        }
        else{
            System.out.println("NOT ADULT");
        }

    }
}
