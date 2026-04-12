package Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0;
    protected int front=0;
    private int size=0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int n){
        this.data=new int[n];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("no item to remove in queue");
        }
        int rem=data[front++];
        front=front% data.length;
        size--;

        return rem;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue empty");
        }
        return data[front];
    }
    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("queue empty");

        }
        int i=front;
        do{
            System.out.println(data[i]+" ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("END");
    }
}
