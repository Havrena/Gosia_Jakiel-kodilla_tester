public class BookApp extends Book {
    public static void main(String[] args) {
        String book = Book.of("Tolkien", "The Hobbit");
        System.out.println(book);
    }
}