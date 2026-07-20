public class HotDogStand {
    private int id;
    private int sold = 0;

    public HotDogStand(int id, int sold) {
        this.id = id;
        this.sold = sold;
    }

    public int getId() { return id; }
    public int getSold() { return sold; }

    public void justSold() {
        sold++;
    }

    public static void main(String[] args) {
        HotDogStand s1 = new HotDogStand(1, 45);
        HotDogStand s2 = new HotDogStand(2, 67);
        HotDogStand s3 = new HotDogStand(3, 78);

        s1.justSold();
        s1.justSold();
        s2.justSold();
        s3.justSold();
        s3.justSold();

        System.out.println("Stand " + s1.getId() + " sold: " + s1.getSold());
        System.out.println("Stand " + s2.getId() + " sold: " + s2.getSold());
        System.out.println("Stand " + s3.getId() + " sold: " + s3.getSold());
    }
}
