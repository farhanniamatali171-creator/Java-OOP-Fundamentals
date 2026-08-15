class Movie {
    protected String mpaa;
    protected int id;
    protected String title;

    public Movie(String mpaa, int id, String title) {
        this.mpaa = mpaa;
        this.id = id;
        this.title = title;
    }

    public String getMpaa() {
        return mpaa;
    }

    public void setMpaa(String mpaa) {
        this.mpaa = mpaa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        return this.id == other.id;
    }

    double calcLateFees(int daysLate) {
        return 2 * daysLate;
    }
}

class Action extends Movie {
    public Action(String mpaa, int id, String title) {
        super(mpaa, id, title);
    }

    @Override
    double calcLateFees(int daysLate) {
        return 3 * daysLate;
    }
}

class Comedy extends Movie {
    public Comedy(String mpaa, int id, String title) {
        super(mpaa, id, title);
    }

    @Override
    double calcLateFees(int daysLate) {
        return 2.50 * daysLate;
    }
}

class Dramas extends Movie {
    public Dramas(String mpaa, int id, String title) {
        super(mpaa, id, title);
    }

    @Override
    double calcLateFees(int daysLate) {
        return 2 * daysLate;
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new Movie("G", 1, "Crack");
        Movie m2 = new Action("PG", 2, "world");
        Movie m3 = new Comedy("PG-13", 3, "Success");
        Movie m4 = new Dramas("R", 4, "Words");
        Movie m5 = new Movie("G", 1, "Crack");

        System.out.println("Late fee days are: " + m1.calcLateFees(2));
        System.out.println("Late fee days are: " + m2.calcLateFees(5));
        System.out.println("Late fee days are: " + m3.calcLateFees(6));
        System.out.println("Late fee days are: " + m4.calcLateFees(3));
        System.out.println("Late fee days are: " + m5.calcLateFees(9));
        System.out.println("==Equals Method==");
        System.out.println(m1.equals(m5));
    }
}
