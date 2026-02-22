package basic;

public class Main {
    public static void main(String[] args) {
        CustomLL list=new CustomLL();
        list.insertFirst(17);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertlast(99);
        list.insert(100,3);
        list.display();
    }
}
