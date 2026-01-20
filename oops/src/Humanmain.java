class Humanmain {
    int age;
    String name;
    int salary;
    boolean maried;
    static int population;

    Humanmain(int age,String name,int salary,boolean maried){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.maried=maried;
        Humanmain.population+=1;

    }

}
class mmain {

    public static void main(String[] args) {

        Humanmain Guru=new Humanmain(22,"Guruprakash",100000,false);
        Humanmain jeeva=new Humanmain(20,"jeeva",100000,false);

        System.out.println(Humanmain.population);
        System.out.println(Humanmain.population);
        mmain a=new mmain();
        a.greet();
    }
    void greet(){
        System.out.println("Hello guys how are you");
    }
}
