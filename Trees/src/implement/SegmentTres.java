package implement;

public class SegmentTres {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        SegmentTres tree=new SegmentTres();

    }
    private static class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;
        public Node(int startinterval,int endinterval){
            this.startinterval=startinterval;
            this.endinterval=endinterval;
        }
    }

    Node root;
    public SegmentTres(){

    }


}
