import java.util.*;
public class incometax_calci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        double income = sc.nextDouble();
        double tax;
        if(income<500000){
            tax=0;
        }else if(income>500000 && income<=1000000){
            tax= income * 0.20;
        }
        else{
            tax = income * 0.30;
        }
        System.out.println("your tax is "+ tax);
    }
}
