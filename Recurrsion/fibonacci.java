public class fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=fibo(n-1);
        int fnm2=fibo(n-2);
        int fb=fnm1+fnm2;
        return fb;
    }
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
}
