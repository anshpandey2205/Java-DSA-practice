public class Add_middle {
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

    public void addFirst(int data){
        // STEP 1 = CREATE NEW NODE
        node newNode=new node(data);
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
        Add_middle add= new Add_middle();
        System.out.println("before array is");
        add.addFirst(2);
        add.addFirst(1);
        add.addLast(3);
        add.addLast(4);
        add.print();
        System.out.println("After adding new node");
        add.addMiddle1(2,8);
        add.print();
    }
}
