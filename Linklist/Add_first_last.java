public class Add_first_last {
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

    public static void main(String[] args) {
        Add_first_last add= new Add_first_last();
         System.out.println("AFTER ADDING FIRST NODE");
        add.addFirst(2);
        add.addFirst(1);
        add.print();
         System.out.println("AFTER ADDING LAST NODE");
        add.addLast(3);
        add.addLast(4);
        add.print();
    }
}