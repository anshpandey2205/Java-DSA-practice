public class questions_pattern_1 {
    public static void pattern(int n){
        //int count=1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        pattern(5);
    }
}
