import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI {
    private JFrame frame;
    private Library library;
    private JLabel label;

    public LibraryGUI(Library library) {
        this.library = library;
        frame = new JFrame("Library System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        JButton addMemberButton = new JButton("Add Member");
        JButton addBookButton = new JButton("Add Book");
        JButton borrowBookButton = new JButton("Borrow Book");
        JButton returnBookButton = new JButton("Return Book");
        JButton showListButton = new JButton("Show List");
        label = new JLabel("Library System");

        panel.add(addMemberButton);
        panel.add(addBookButton);
        panel.add(borrowBookButton);
        panel.add(returnBookButton);
        panel.add(showListButton);
        panel.add(label);

        addMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter name:");
                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
                int memberId = Integer.parseInt(JOptionPane.showInputDialog("Enter member ID:"));
                library.addMember(new Member(name, age, memberId));
                label.setText("Member added successfully: " + name);
            }
        });

        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = JOptionPane.showInputDialog("Enter title:");
                String author = JOptionPane.showInputDialog("Enter author:");
                int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year:"));
                library.addBook(new Book(title, author, year));
                label.setText("Book added successfully: " + title);
            }
        });

        borrowBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int memberId = Integer.parseInt(JOptionPane.showInputDialog("Enter member ID:"));
                String title = JOptionPane.showInputDialog("Enter title:");
                Member member = library.findMemberByID(memberId);
                Book book = library.findBookByTitle(title);
                if (member != null && book != null) {
                    member.borrowBook(book);
                    label.setText("Book borrowed successfully: " + title);
                } else {
                    label.setText("Member or book not found");
                }
            }
        });

        returnBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int memberId = Integer.parseInt(JOptionPane.showInputDialog("Enter member ID:"));
                String title = JOptionPane.showInputDialog("Enter title:");
                Member member = library.findMemberByID(memberId);
                Book book = library.findBookByTitle(title);
                if (member != null && book != null) {
                    member.returnBook(book);
                    label.setText("Book returned successfully: " + title);
                } else {
                    label.setText("Member or book not found");
                }
            }
        });

        showListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder("Members: \n");
                for (Member member : library.getMembers()) {
                    sb.append(member.toString()).append("\n");
                }

                sb.append("Books: \n");
                for (Book book : library.getBooks()) {
                    sb.append(book.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(frame, sb.toString());
            }
        });

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

    
