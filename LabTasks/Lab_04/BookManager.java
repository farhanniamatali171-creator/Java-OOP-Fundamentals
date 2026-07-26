public class BookManager {
    private String author;
    private String[] chapterName = new String[100];
    private int chapterCount;

    public BookManager() {
        author = "";
        chapterCount = 0;
    }

    public BookManager(String author, String[] chapter) {
        this.author = author;
        this.chapterCount = chapter.length;
        for (int i = 0; i < chapter.length; i++) {
            this.chapterName[i] = chapter[i];
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapterName(String chapterName) {
        this.chapterName[chapterCount] = chapterName;
        chapterCount++;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public boolean compareBook(BookManager b1, BookManager b2) {
        return b1.author.equals(b2.author);
    }

    public BookManager compareCount(BookManager b1, BookManager b2) {
        if (b1.chapterCount > b2.chapterCount)
            return b1;
        else
            return b2;
    }

    public static void main(String[] args) {
        BookManager b1 = new BookManager();
        b1.setAuthor("Ali");
        b1.setChapterName("oop");
        b1.setChapterName("intro");

        String[] chapters = {"oop", "intro", "inheritance"};
        BookManager b2 = new BookManager("Ahmad", chapters);

        boolean sameAuthor = b1.compareBook(b1, b2);
        System.out.println("Same Author: " + sameAuthor);

        BookManager biggerBook = b1.compareCount(b1, b2);
        System.out.println("Book with more chapters: " + biggerBook.getAuthor());
    }
}
