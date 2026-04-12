package stack;

public class cusstack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;

    public cusstack(){
        this(DEFAULT_SIZE);
    }
    public cusstack(int size){
        this.data=new int[size];

    }
    public boolean push(int item){
        if(isFull()){
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        int rem=data[ptr];

        ptr--;
        return rem;
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
