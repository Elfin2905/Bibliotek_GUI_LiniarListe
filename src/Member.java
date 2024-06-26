import java.util.ArrayList;

public class Member extends Person{
    private String memberId;
    private String borrowBooks;
    private ArrayList<Book> books;
    
    public Member(String name, int age, String memberId){
        super(name, age);
        this.memberId = memberId;
        this.books = new ArrayList<Book>();
    }

    public String getMemberId(){
        return memberId;
    }

    public void setMemberId(String memberId){
        this.memberId = memberId;
    }

    public String getBorrowBooks(){
        return borrowBooks;
    }

    public void setBorrowBooks(String borrowBooks){
        this.borrowBooks = borrowBooks;
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void setBooks(ArrayList<Book> books){
        this.books = books;
    }

    public void borrowBooks(Book book) {
        books.add(book);
    }

    public String toString() {
        return toString() + ", Member ID: " + memberId + ", Borrow Books: " + books;
    }
    
}
