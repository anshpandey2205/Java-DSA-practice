import java.util.*;
public class largest_among_three {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value a");
        int a = sc.nextInt();
        System.out.println("enter value b");
        int b = sc.nextInt();
        System.out.println("enter value c");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater");
        }
        else if(b>a && b>c){
            System.out.println("B is grater");
        }
        else{
            System.out.println("C is greater");
        }

    }
}
