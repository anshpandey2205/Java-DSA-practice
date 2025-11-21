public class mergeSort {
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


        // MID NODE

    public node getmid(node head){
        node slow=head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public node merge(node head1,node head2){
        node mergedLL=new node(-1);
        node temp=mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public node mergesort(node head){
        while(head==null|| head.next==null){
            return head;
        }

        node mid=getmid(head);
        node rightHead=mid.next;
        mid.next=null;
        node newLeft=mergesort(head);
        node newRight=mergesort(rightHead);

        return merge(newLeft, newRight);

    }

    public static void main(String[] args) {
        mergeSort add= new mergeSort();
         System.out.println("AFTER ADDING FIRST NODE");
        add.addFirst(3);
        add.addFirst(4);
         System.out.println("AFTER ADDING LAST NODE");
        add.addLast(2);
        add.addLast(1);
        add.print();

        add.mergesort(head);
        add.print();

    }
}
