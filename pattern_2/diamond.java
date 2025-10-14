public class diamond {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=1;l<=n;l++){
            for(int m=1;m<l;m++){
                System.out.print(" ");
            }
            for(int o=n;o>=l;o--){
                System.out.print("*");
            }
            for(int p=n;p>l;p--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        pattern(7);

    }
}
