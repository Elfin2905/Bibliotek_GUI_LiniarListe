public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.title = name;
        this.author = author;
        this.year = year;

    }
    
    public String getTitle() {
        return title;
    }

    private String author() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}