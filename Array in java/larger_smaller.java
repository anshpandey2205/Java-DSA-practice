import java.util.*;
public class larger_smaller {
    public static int getLargest (int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest=numbers[i];
            }
        }
        return largest;
            }
    public static int getSmallest (int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest=numbers[i];
            }
        }
        return smallest;
    }
        public static void main (String[]args){
            int numbers[] = {1, 3, -5, 9, 10, 99};
            System.out.println("largest number: "+getLargest(numbers));
            System.out.println("smallest number: "+getSmallest(numbers));
        }
    }
