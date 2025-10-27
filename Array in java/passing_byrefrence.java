import java.util.*;
public class passing_byrefrence {
    public static void update(int marks[],int notchangable){
        notchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[]args){
        int notchangable=5;
        int marks[]={98,99,100};
        update(marks,notchangable);
        System.out.println(notchangable);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }
}
