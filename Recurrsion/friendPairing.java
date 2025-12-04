public class friendPairing {
    public static int CountWays(int n){
        if(n==1 || n==2){
            return n;
        }
        // kaaam // Choice
        // single
        int nm1=CountWays(n-1);

        // pairing
        int nm2=CountWays(n-2);
        int pairWays=(n-1)*nm2;

        int totalways=nm1+pairWays;
        return totalways;
    }

    public static int secondWay(int n){
        if(n==1 || n==2){
            return n;
        }
        return secondWay(n-1)+(n-1)*secondWay(n-2);
    }
    public static void main(String[] args) {
        //System.out.println(CountWays(3));
        System.out.println(secondWay(3));
    }
}
