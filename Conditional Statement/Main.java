import java.util.*;
public class Main {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are Adult");
        }
        else{
            System.out.println("You are not Adult");
        }
        System.out.println("Enter value A");
        int a = sc.nextInt();
        System.out.println("Enter value B");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A is greater");
        }
        if(a==b){
            System.out.println("Equal");
        }
        else{
            System.out.println("B is greater");
        }

    }
}
