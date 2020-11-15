package com.lectures.lecture08;

public class teacherMain {


    public static void main(String[] args) {
        Teacher teacher = new Teacher("Penev", 35, "Plovdiv", "HighSchool");
    }

    public void setDay(days days){
        switch(days)
        {
            case MONDAY:
        System.out.println("Penev has Math class.");
                break;
            case TUESDAY:
                System.out.println("Penev has Programing class");
                break;
            case WEDNESDAY:
                System.out.println("Penev has day off");
                break;
            case THURSDAY:
                System.out.println("Penev has Programing and Math classes.");
                break;
            case FRIDAY:
                System.out.println("Penev has Programing class");
                break;
        }
    }
}

