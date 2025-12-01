public class decreaseOrder {

    public static void decreasenumber(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decreasenumber(n-1);
    }
    public static void main(String[] args) {
        decreasenumber(10);
    }
}
