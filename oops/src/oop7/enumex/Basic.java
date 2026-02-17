package oop7.enumex;

public class Basic {
    enum Week{
        Monday,tuesday,wednesday,thursday,friday,saturday,sunday
        //enumeration
        //public static and final
        // type is week
    }

    public static void main(String[] args) {
        Week week;
        week=Week.friday;

        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
