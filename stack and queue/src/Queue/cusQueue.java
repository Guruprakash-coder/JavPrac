package Queue;

public class cusQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=-1;

    public cusQueue(){
        this(DEFAULT_SIZE);
    }
     public cusQueue(int n){
        this.data=new int[n];
     }
    public boolean isFull(){
        return end==data.length-1;
    }
    public boolean isEmpty(){
        return end==-1;
    }
}
