public class calcu_size {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size; 

    public void addFirst(int data){
        // STEP 1 = CREATE NEW NODE
        node newNode=new node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // STEP 2 = NEWNODE NEXT= TEMP
        newNode.next=head;

        // STEP 3 = HEAD = NEWNODE
        head=newNode;
    }

    public void addLast(int data){
        node newNode=new node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        //System.out.println();
    }

              //  ADD NEW NODE IN MIDDLE

    public void addMiddle1(int index,int data){

        if(index==0){
            addFirst(data);
            return;
        }
        node newNode= new node(data);
        size++;
        node temp=head;
        int i=0;

        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }


    public static void main(String[] args) {
        calcu_size add= new calcu_size();
        System.out.println("before array is");
        add.addFirst(2);
        add.addFirst(1);
        add.addLast(4);
        add.addLast(5);
        add.print();
        System.out.println("After adding new node");
        add.addMiddle1(2,3);
        add.print();
        System.out.print("size od ll is "+add.size);
    }
}
