import java.util.*;
public class maxHistogram {

    public static void MaxArea(int arr[]){
        int maxArea= 0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];

        // NEXT GREATER RIGHT
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i]=arr.length;
        }else{
            nsr[i]=s.peek();
        }
        s.push(i);
    }

    // NEXT SMALLER LEFT
    s=new Stack<>();
    for(int i=0;i<arr.length;i++){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }else{
            nsl[i]=s.peek();
        }
        s.push(i);
    }

    // CURRENT AREA
    for(int i=0;i<arr.length;i++){
        int length=arr[i];
        int breadth=nsr[i]-nsl[i]-1;
        int currArea=length*breadth;
         maxArea=Math.max(currArea, maxArea);
    }
    System.out.println("Max area ina histogram is = "+maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};    
        MaxArea(arr);
    }
}
