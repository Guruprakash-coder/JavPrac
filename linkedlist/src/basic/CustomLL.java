package basic;

public class CustomLL {
    private Node head;
    private Node tail;

    private int size;

    public CustomLL(){
        this.size=0;
    }
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    public void bubbleSort(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node first=get(col);
            Node second=get(col+1);
            if(first.value>second.value){
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;
                }else if(second == tail){
                    Node prev=get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;
                }else{
                    Node prev=get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubbleSort(row,col+1);
        }else{
            bubbleSort(row-1,0);
        }
    }
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail == null){
            tail=head;
        }
        size+=1;
    }

    public void insert(int val,int index){

        if(index==0){
            insertFirst(val);
        }else if(index==size){
            insertlast(val);
        }else{
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;

            }
            Node node=new Node(val,temp.next);
            temp.next=node;
            size++;
        }

    }
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
    public void insertlast(int value){
        if(tail==null){
            insertFirst(value);
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;

        size++;
    }
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;

    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value == val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
