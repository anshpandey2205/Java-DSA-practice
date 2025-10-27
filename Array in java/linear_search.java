import java.util.*;
public class linear_search {
    public static int linear_search1(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10,12,14,16};
        System.out.println("enter the key");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();

        int index=linear_search1(numbers,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("index is: "+index);
        }
    }
}
