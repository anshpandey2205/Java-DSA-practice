public class searchRotated {  
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid= (si+ei)/2;

        if(arr[mid]==tar){
            return mid;
        }

        // on line 1
        if(arr[si]<=arr[mid]){
            // case 1 // left
            if(arr[si]<=tar&& tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
            // case 2 // right
                return search(arr, tar, mid+1, ei);
            }
        }else{
            // On line 2

            // Case 1 // right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
            // Case 2 // left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tarIdx=search(arr, 0, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
 