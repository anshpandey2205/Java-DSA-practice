public class function_parameter {
   public static void calculation(int a , int b){
        int sum=a+b;
       System.out.println(sum);
    }
    public static int calculation2(int a,int b){
       int sum = a+b;
        System.out.println(sum);
       return sum;
    }

    public static void main(String[]args){
       calculation(5,6);
       calculation2(8,8);

    }
}
