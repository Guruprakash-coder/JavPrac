package basic;

public class DoublyCustomLL {
    private Node head;
    private Node tail;

    private int size;

    public DoublyCustomLL(){
        this.size=0;
    }
    public void insertFirst(int val){

        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }

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
    public void insertlast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        node.prev=tail;
        tail=node;
        tail.next=null;

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
    public void displayRev(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.prev;
        }
        System.out.print("Start");
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next,Node prev) {
            this.value = value;
            this.next = next;
            this.prev=prev;
        }
    }

}
