public class main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Зеленая миля", "Стивен Кинг", 1996));
        library.addBook(new Book("Унесенные ветром", "Маргарет Митчелл", 1936));
        library.addBook(new Book("Великий Гэтсби", "Френсис Скотт Фитцджеральд", 1925));

        library.sortTitle();
        library.getBooks();
        System.out.println();

        library.sortAuthor();
        library.getBooks();
        System.out.println();

        library.sortYear();
        library.getBooks();
        System.out.println();

        for (Book book: library) {
            System.out.println(book.toString());
        }
    }
}