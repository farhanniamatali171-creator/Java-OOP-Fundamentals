public class Fraction {
    private int nominator;
    private int denominator;

    public Fraction() {
        nominator = 0;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        nominator = n;
        denominator = d;
    }

    public void set(int n, int d) {
        nominator = n;
        denominator = d;
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void display() {
        System.out.println(nominator + "/" + denominator);
    }

    public boolean equals(Fraction f) {
        return (this.nominator == f.nominator && this.denominator == f.denominator);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        
        f1.display();
        f2.display();
        System.out.println("Are they equal: " + f1.equals(f2));
    }
}
