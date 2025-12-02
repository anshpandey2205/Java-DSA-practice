public class firstOccurance {
    public static int occurance(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return  occurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,2,3,1,5,6,7};
        System.out.println(occurance(arr, 5, 0));
    }
}
