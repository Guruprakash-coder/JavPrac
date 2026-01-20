package oop3.inheritance;

public class box {
    private double l;
    double h;
    double w;
    box(){
        super();
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    box(double l,double h,double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    box(box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void infor(){
        System.out.println("Running the box");
    }
}
