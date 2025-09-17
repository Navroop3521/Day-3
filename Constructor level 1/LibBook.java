class LibBook {
    public String ISBN;
    protected String title;
    private String author;

    LibBook(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends LibBook {
    double size;

    EBook(String i, String t, String a, double s) {
        super(i, t, a);
        size = s;
    }

    void display() {
        System.out.println(ISBN + " " + title + " " + getAuthor() + " " + size);
    }

    public static void main(String[] args) {
        EBook e = new EBook("123", "Java", "James", 2.5);
        e.display();
    }
}

