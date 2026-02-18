package oop7.enumex;

public class Basic {
    enum Week implements A{
        Monday,tuesday,wednesday,thursday,friday,saturday,sunday;
        //enumeration
        //public static and final
        // type is week

        Week(){
            System.out.println("Constructor called for "+this);
        }

        @Override
        public void hello()  {
            System.out.println("Hello how are you");
        }
    }

    public static void main(String[] args) {
        Week week;
        week=Week.friday;


        for(Week day: Week.values()){
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
