public class binaryString {
    public static void printbinString(int n,int lastdigit,String str){
        // Base case
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinString(n-1,0, str+"0");
        if(lastdigit==0){
            printbinString(n-1,1, str+"1");
        }
    }
    public static void main(String[] args) {
        printbinString(3, 0, "");
    }
}
