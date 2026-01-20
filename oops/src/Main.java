
class Students{
    int rno;
    String name;
    float[] marks=new float[5];

    Students(int rno,String name,float[] marks){
        this.rno=rno;
        this.name=name;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=marks[i];
        }

    }
    void display(){
        System.out.println("name="+this.name);
        System.out.println("rollno="+this.rno);
    }
    
}
public class Main {
    public static void main(String[] args) {
        float[] marks={32.6f,34,54,65,76};
        final Students guruprakash=new Students(25,"guruprakash",marks);
        //guruprakash=new Students(34,"gopal",marks);
        guruprakash.name="gopal";
        guruprakash.display();
        //message();


    }

}
