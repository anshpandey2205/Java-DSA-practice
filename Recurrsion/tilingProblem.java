public class tilingProblem {
    public static int TilingWays(int n){ // 2*n(floor size)
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        // vertical choice
        int nm1=TilingWays(n-1);

        // horizontal choice
        int nm2=TilingWays(n-2);

        int totalWays=nm1+nm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(TilingWays(4));
    }
}
