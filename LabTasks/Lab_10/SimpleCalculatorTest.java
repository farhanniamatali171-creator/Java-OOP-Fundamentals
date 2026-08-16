class Simple {
    protected int num1;
    protected int num2;

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int add() {
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    int sub() {
        System.out.println(num1 - num2);
        return num1 - num2;
    }

    int mul() {
        System.out.println(num1 * num2);
        return num1 * num2;
    }

    double div() {
        if (num2 == 0) {
            System.out.println("Divided a number by zero is not possible ");
        } else {
            System.out.println(num1 / num2);
        }
        return (double) num1 / num2;
    }
}

class VerifySimple extends Simple {
    public VerifySimple(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    int add() {
        if (num1 > 0 && num2 > 0) {
            super.add();
        } else {
            System.out.println("Error");
            return -1;
        }
        return num1 + num2;
    }

    @Override
    int sub() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error");
            return -1;
        }
        return num1 - num2;
    }

    @Override
    int mul() {
        if (num1 > 0 && num2 > 0) {
            super.mul();
        } else {
            System.out.println("Error");
            return -1;
        }
        return num1 * num2;
    }

    @Override
    double div() {
        if (num1 > 0 && num2 > 0) {
            super.div();
        } else {
            System.out.println("Error");
            return -1;
        }
        return (double) num1 / num2;
    }
}

public class SimpleCalculatorTest {
    public static void main(String[] args) {
        System.out.println("===Object 1===");
        VerifySimple v1 = new VerifySimple(10, 2);
        v1.add();
        v1.sub();
        v1.mul();
        v1.div();

        System.out.println("===Object 2===");
        VerifySimple v2 = new VerifySimple(10, 0);
        v2.add();
        v2.sub();
        v2.mul();
        v2.div();
    }
}
