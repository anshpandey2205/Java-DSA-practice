import java.util.*;
public class practice_questions {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number");
//        int num = sc.nextInt();
//        if(num>0){
//            System.out.println("number is positive");
//        }else if(num==0){
//            System.out.println("number is zero");
//        }
//        else{
//            System.out.println("number is negative");
//        }

                      //  PROBLEM 2

//        System.out.println("enter temperature");
//        double temp = sc.nextDouble();
//        if(temp>100){
//            System.out.println("you have feever");
//        }
//        else{
//            System.out.println("you don't have feever");
//        }

                       //  PROBLEM 3

        System.out.println("enter day");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("error");
        }


    }
}
