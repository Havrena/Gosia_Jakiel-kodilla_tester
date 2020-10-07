public class Book {

    private static String author;
    private static String title;
    private static String book;

    public static String of(String author, String title) {
        Book.book = author + ", " + title;

        return Book.book;
    }
}