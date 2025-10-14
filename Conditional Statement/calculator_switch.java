import java.util.*;
public class calculator_switch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        double a = sc.nextDouble();
        System.out.println("enter operator");
        char oper = sc.next().charAt(0);
        System.out.println("enter number2");
        double b = sc.nextDouble();
        switch(oper){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operator");
        }

    }
}
