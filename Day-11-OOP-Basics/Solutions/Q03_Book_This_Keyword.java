class Book {

    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }
}

public class Q03_Book_This_Keyword {
    public static void main(String[] args) {

        Book book = new Book(
            "Java Programming",
            "James Gosling",
            599
        );

        book.display();
    }
}