public class CheckPalindrome {
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

     public node findMid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;       // +1
            fast=fast.next.next;  // +2
        }
        return slow;     // Slow is mid Node
     }

     public boolean checkpalindro(){
        if(head==null || head.next==null){
            return true;
        }

          //  FIND MID TERM
        node midNode=findMid(head);

          // REVERSE HALF LIST
      node prev=null;
      node curr=midNode;
      node next;  
      
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      node right=prev;
      node left=head;

          // CHECK LEFT HALF AND RIGHT HALF
     while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
     }  
     return true;   
     }
                

    public static void main(String[] args) {
        CheckPalindrome a= new CheckPalindrome();
         System.out.println("AFTER ADDING FIRST NODE");
        a.addFirst(2);
        a.addFirst(1);
        a.print();
         System.out.println("AFTER ADDING LAST NODE");
        a.addLast(1);
        //a.addLast(4);
        //a.addLast(5);
        a.print();
       System.out.println(a.checkpalindro()); 
    }
}
