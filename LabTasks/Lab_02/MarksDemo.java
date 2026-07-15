class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    public Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    public Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getMark1() { return mark1; }
    public void setMark1(int mark1) { this.mark1 = mark1; }

    public int getMark2() { return mark2; }
    public void setMark2(int mark2) { this.mark2 = mark2; }

    public int getMark3() { return mark3; }
    public void setMark3(int mark3) { this.mark3 = mark3; }

    public int Display() {
        return mark1 + mark2 + mark3;
    }
}

public class MarksDemo {
    public static void main(String[] args) {
        Marks t1 = new Marks();
        Marks t2 = new Marks(5, 10, 15);

        System.out.println("Constructor 1 (Default constructor):");
        System.out.println("Sum = " + t1.Display());

        System.out.println();

        System.out.println("Constructor 2:");
        System.out.println("Sum = " + t2.Display());
    }
}
