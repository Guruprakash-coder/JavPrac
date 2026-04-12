package Queue;

public class cusQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;

    public cusQueue(){
        this(DEFAULT_SIZE);
    }
     public cusQueue(int n){
        this.data=new int[n];
     }
    public boolean isFull(){
        return end==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("no item to remove in queue");
        }
        int remove=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;
    }
}
