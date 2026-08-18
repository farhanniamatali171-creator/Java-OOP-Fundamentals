class Package {
    String senderName, senderAddress;
    String receiverName, receiverAddress;
    double weight;
    double costPerOunce;

    public Package(String sName, String sAddress, String rName, String rAddress, double w, double c) {
        senderName = sName;
        senderAddress = sAddress;
        receiverName = rName;
        receiverAddress = rAddress;

        if (w > 0) weight = w;
        if (c > 0) costPerOunce = c;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }
}

class TwoDayPackage extends Package {
    double flatFee;

    public TwoDayPackage(String sName, String sAddress, String rName, String rAddress, double w, double c, double fee) {
        super(sName, sAddress, rName, rAddress, w, c);
        flatFee = fee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}

class OvernightPackage extends Package {
    double extraFee;

    public OvernightPackage(String sName, String sAddress, String rName, String rAddress, double w, double c, double fee) {
        super(sName, sAddress, rName, rAddress, w, c);
        extraFee = fee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + extraFee;
    }
}

public class PackageTest {
    public static void main(String[] args) {
        Package p1 = new Package("Farhan", "Lahore", "Ahmed", "Karachi", 10, 2);
        Package p2 = new TwoDayPackage("Raza", "Islamabad", "Zain", "Multan", 5, 3, 20);
        Package p3 = new OvernightPackage("Ali", "Faisalabad", "Bilal", "Peshawar", 8, 4, 15);

        Package[] list = {p1, p2, p3};

        for (Package p : list) {
            System.out.println(p.calculateCost());
        }
    }
}
