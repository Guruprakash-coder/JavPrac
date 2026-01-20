package oop3.inheritance;

public class BoxWeight extends box{
    double weight;
    BoxWeight(){
        this.weight=-1;

    }
    BoxWeight(double weight){

        this.weight=weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
    BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weight=weight;
    }
}
