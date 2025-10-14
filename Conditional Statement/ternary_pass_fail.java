import java.util.*;
public class ternary_pass_fail {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        float marks = sc.nextFloat();
        String report = marks>=33 ? "You are pass" : "You are fail";
        System.out.println(report);
    }
}
