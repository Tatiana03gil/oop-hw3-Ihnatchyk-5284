public class Book implements Comparable<Book>{
    
    private String title;
    private String author;
    private int publishedYear;
    
    public Book (String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }
    
    public String getTitle () {
        return title;
    }

    public String getAuthor () {
        return author;
    }

    public int getPublishedYear () {
        return publishedYear;
    }

    @Override
    public String toString () {
        return ("\"" + getTitle() + "\" " + getAuthor() + ", " + getPublishedYear()+ ";");
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.getTitle());
    }
}