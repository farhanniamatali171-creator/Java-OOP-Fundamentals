class Publication {
    protected String name;
    protected int price;

    public Publication() {
        this.name = "OOP";
        this.price = 1000;
    }

    public Publication(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public void display() {
        System.out.println("Name is :" + name);
        System.out.println("Price is :" + price);
    }
}

class BookItem extends Publication {
    protected int page;

    public BookItem(String name, int price, int page) {
        super(name, price);
        this.page = page;
    }

    public int getPage() { return page; }
    public void setPage(int page) { this.page = page; }

    @Override
    public void display() {
        super.display();
        System.out.println("Pages :" + page);
    }
}

class TapeItem extends Publication {
    protected int playingTime;

    public TapeItem(String name, int price, int page, int playingTime) {
        super(name, price);
        this.playingTime = playingTime;
    }

    public int getPlayingTime() { return playingTime; }
    public void setPlayingTime(int playingTime) { this.playingTime = playingTime; }

    @Override
    public void display() {
        super.display();
        System.out.println("Playing time is :" + playingTime + " minutes");
    }
}

public class PublicationLabTask2 {
    public static void main(String[] args) {
        BookItem b1 = new BookItem("JAVA", 1200, 540);
        b1.display();
        System.out.println();
        TapeItem t1 = new TapeItem("PF", 1500, 780, 23);
        t1.display();
    }
}
