
public class binomial_function {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bino_funct(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bino_funct = fact_n/(fact_r*fact_nmr);
        return bino_funct;
    }
    public static void main(String[]args){
        System.out.println(bino_funct(5,2));

    }
}
