public class del_first_last {
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

                        //  DELETE FIRST NODE   

    public int removeFirst(){
        if(size==0){
            System.out.println("Nothing to delete ll empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
        }

        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

                         //  DELETE LAST NODE
                         
    public int removeLast(){
        if(size==0){
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }                     


    public static void main(String[] args) {
        del_first_last a= new del_first_last();
        System.out.println("before array is");
        a.addFirst(2);
        a.addFirst(1);
        a.addLast(4);
        a.addLast(5);
        a.print();
        System.out.println("size od ll is "+a.size);
        System.out.println("After adding new node");
        a.addMiddle1(2,3);
        a.print();
        System.out.println("size od ll is "+a.size);
        System.out.println("After deleting first");
        a.removeFirst();
        a.print();
        System.out.println("size od ll is "+a.size);
        System.out.println("After deleting last");
        a.removeLast();
        a.print();
        System.out.print("size od ll is "+a.size);
    }
}
