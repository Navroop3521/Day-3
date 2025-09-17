class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed");
        } else {
            System.out.println(title + " not available");
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James", 500);
        b1.borrowBook();
        b1.borrowBook();
    }
}

