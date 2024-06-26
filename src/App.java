

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Member member1 = new Member("John", 20, "M001");
        Member member2 = new Member("Jane", 21, "M002");
        Book book1 = new Book("Java Programming", "John Doe", 2020);
        Book book2 = new Book("Python Programming", "Jane Doe", 2021);
        library.addMember(member1);
        library.addMember(member2);
        library.addBook(book1);
        library.addBook(book2);
        member1.borrowBooks(book1);
        member2.borrowBooks(book2);
        System.out.println("Members: " + library.getMembers());
        System.out.println("Books: " + library.getBooks());
        System.out.println("Find Member by ID: " + library.findMemberByID("M001"));
        System.out.println("Find Book by Title: " + library.findBookByTitle("Java Programming"));
       
    }
}

