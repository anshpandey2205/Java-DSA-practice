public class RemoveLoop {
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
               
                    // DETECT A LOOP OR CYCLE

    public static void removeCycle(){
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        slow=head;
        node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }   
    
     // DETECT A LOOP OR CYCLE

    public static boolean check(){
        node slow=head;
        node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }       

    public static void main(String[] args) {
        head=new node(1);
        node temp=new node(2);
        head.next=temp;
        head.next.next=new node(3);
        head.next.next.next=temp;

        System.out.println(check());
        removeCycle();
        System.out.println(check());
       
    }
}
