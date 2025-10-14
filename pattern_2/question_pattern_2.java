public class question_pattern_2 {
    public static void pattern(int n){

       for(int i=1;i<=n;i++){
           for(int j=n;j>=i;j--){
               System.out.print("_");
           }
           for(int j=i;j>=1;j--){
               System.out.print(j);
           }
           for(int k=2;k<=i;k++){
               System.out.print(k);
           }
           System.out.println();
       }
    }
    public static void main(String[]args){
        pattern(5);
    }
}
