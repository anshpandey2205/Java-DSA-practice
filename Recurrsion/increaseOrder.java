public class increaseOrder {
    public static void printIncrease(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncrease(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printIncrease(10);
    }
}
