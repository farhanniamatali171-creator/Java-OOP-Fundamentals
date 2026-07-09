public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.hours = 2;
        t1.minutes = 34;
        t1.seconds = 56;
        t1.display();
    }
}

class Time {
    int hours;
    int minutes;
    int seconds;

    public void display() {
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
