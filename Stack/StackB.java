package Stack;
import java.util.ArrayList;
public class StackB {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
           
        //  EMPTY

        public static boolean IsEmpty(){
            return list.size()==0;
        }

        // PUSH

        public static void push(int data){
            list.add(data);
        }

        // POP

        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(top);
            return top;
        }

        // peek

        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.IsEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
