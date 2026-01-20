package oop5.interfaces;

public class Newcar {
    private engine e1;
    private Media m1=new CDplayer();
    public Newcar(){
        e1=new powerengine();
    }
    public Newcar(engine e){
        this.e1=e;
    }
    public void start(){
        e1.start();
    }
    public void stop(){
        e1.stop();
    }
    public void musicStart(){
        m1.start();
    }
    public void musicStop(){
        m1.stop();
    }
}
