public class optimizedcalPow {
    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int op=optimizedPower(x, n/2);
        int halfpowerSquare=op*op;
        if(n%2!=0){
            halfpowerSquare=x*halfpowerSquare;
        }
        return halfpowerSquare;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 5));
    }
}
