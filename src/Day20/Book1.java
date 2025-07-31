package Day20;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class BookFormatter {
    public String getFormattedTitle(Book book) {
        return "Title: " + book.getTitle().toUpperCase();
    }
}

class BookDiscountCalculator {
    public double calculateDiscountedPrice(Book book, double discountPercentage) {
        return book.getPrice() * (1 - discountPercentage);
    }
}

public class Book1 {
    public static void main(String[] args) {
        Book book = new Book("Atomic Habits", "James Clear", 499.0);

        BookFormatter formatter = new BookFormatter();
        System.out.println(formatter.getFormattedTitle(book)); // Title: ATOMIC HABITS

        BookDiscountCalculator calculator = new BookDiscountCalculator();
        double discountedPrice = calculator.calculateDiscountedPrice(book, 0.15);
        System.out.println("Discounted Price: ₹" + discountedPrice); // ₹424.15
    }
}