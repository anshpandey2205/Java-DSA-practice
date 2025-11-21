public class Add_first_last {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node first;
    public static node temp;

    public void addFirst(int data){
        // STEP 1 = CREATE NEW NODE
        node newNode=new node(data);
        if(first==null){
            first=temp=newNode;
            return;
        }

        // STEP 2 = NEWNODE NEXT= TEMP
        newNode.next=first;

        // STEP 3 = HEAD = NEWNODE
        first=newNode;
    }

    public void addLast(int data){
        node newNode=new node(data);
        if(first==null){
            first=temp=newNode;
            return;
        }
        temp.next=newNode;
        temp=newNode;
    }

    public void print(){
        node ttemp=first;
        while(ttemp!=null){
            System.out.println(ttemp.data);
            ttemp=ttemp.next;
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