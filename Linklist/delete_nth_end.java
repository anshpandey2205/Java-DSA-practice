public class delete_nth_end {
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

                      //  DELETE NTH NODE FROM LAST INDEX

    public int deletend(int n){

                    //  TO CALCULATE SIZE
        int sz=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return 0;
        }

        int i=1;
        int indfind=sz-n;
        node prev=head;
        while(i<indfind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return 0;
    }                  

    public static void main(String[] args) {
        delete_nth_end a= new delete_nth_end();
         System.out.println("AFTER ADDING FIRST NODE");
        a.addFirst(2);
        a.addFirst(1);
        a.print();
         System.out.println("AFTER ADDING LAST NODE");
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        a.print();
        System.out.println("After deleting nth node");
        a.deletend(3);
        a.print();
    }
}
