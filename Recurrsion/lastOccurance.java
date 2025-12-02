public class lastOccurance {

    public static int occurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=occurance(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={8,1,2,7,8,};
        System.out.println(occurance(arr, 5, 0));
    }
}
