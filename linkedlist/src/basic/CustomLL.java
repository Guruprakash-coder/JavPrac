package basic;

public class CustomLL {
    private Node head;
    private Node tail;

    private int size;

    public CustomLL(){

        this.size=0;
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
    public void insertlast(int value){
        if(tail==null){
            insertFirst(value);
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;

        size++;
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
