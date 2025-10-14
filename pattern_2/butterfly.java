public class butterfly {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=4;k>i;k--){
                System.out.print(" ");
            }
            for(int l=4;l>i;l--){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int o=1;o<=n;o++){
            for(int p=4;p>=o;p--){
                System.out.print("*");
            }
            for(int q=1;q<o;q++){
                System.out.print(" ");
            }
            for(int r=1;r<o;r++){
                System.out.print(" ");
            }
            for(int s=4;s>=o;s--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        pattern(4);

    }
}
