abstract class Convert {
    double val1, val2;

    public Convert(double v) {
        val1 = v;
    }

    abstract void compute();

    public double getResult() {
        return val2;
    }
}

class L_to_G extends Convert {
    public L_to_G(double v) {
        super(v);
    }

    @Override
    public void compute() {
        val2 = val1 * 0.264172;
    }
}

class F_to_C extends Convert {
    public F_to_C(double v) {
        super(v);
    }

    @Override
    public void compute() {
        val2 = (val1 - 32) * 5 / 9;
    }
}

class F_to_M extends Convert {
    public F_to_M(double v) {
        super(v);
    }

    @Override
    public void compute() {
        val2 = val1 * 0.3048;
    }
}

public class ConvertTest {
    public static void main(String[] args) {
        Convert[] list = new Convert[3];

        list[0] = new L_to_G(10);
        list[1] = new F_to_C(100);
        list[2] = new F_to_M(5);

        for (Convert c : list) {
            c.compute();
            System.out.println(c.getResult());
        }
    }
}
