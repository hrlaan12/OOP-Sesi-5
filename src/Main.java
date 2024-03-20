public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book = new Book("The Great Gatsby");
        lib.addBook(book);
        System.out.println("Number of books: " + lib.getNumberOfBooks());

        // The following line will result in a compiler error, as the Member class is not accessible
        Member mem = new Member("John Doe");
        System.out.println("Member name: " + mem.getName());
    }
}