class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with title, author, and price
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();

        // Using title and author constructor
        Book book2 = new Book("Java Programming", "James Gosling");

        // Using all-parameter constructor
        Book book3 = new Book("Clean Code", "Robert C. Martin", 599.99);

        // Display details
        book1.display();
        book2.display();
        book3.display();
    }
}