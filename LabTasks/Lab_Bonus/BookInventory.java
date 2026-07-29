public class BookInventory {
    private String title;
    private String author;
    private int price;

    public BookInventory(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void display() {
        System.out.println("Book Title is  : " + title);
        System.0ut.println("Book Author is : " + author);
        System.out.println("Book Price is  : " + price);
    }

    public static void main(String[] args) {
        BookInventory[] p = new BookInventory[5];

        System.out.println("------------------------------");
        p[0] = new BookInventory("OOP", "Ali", 4500);
        p[1] = new BookInventory("JAVA", "Ahmad", 5000);
        p[2] = new BookInventory("PF", "Raza", 7000);
        p[3] = new BookInventory("ICT", "Noman", 3500);
        p[4] = new BookInventory("DISCRETE", "Haider", 8000);

        BookInventory expensive = p[0];
        for (int i = 0; i < p.length; i++) {
            p[i].display();
            System.out.println("---------------------------");
            if (expensive.price < p[i].price) {
                expensive = p[i];
            }
        }
        System.out.println("Most expensive book price is: " + expensive.price + " by " + expensive.author);
    }
}
