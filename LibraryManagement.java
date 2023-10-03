import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class LibraryManagement
{
    Map<String, Book> library = new TreeMap<>();
    Map<String, Book> issueLibrary = new TreeMap<>();
    Scanner sc = new Scanner(System.in);
    class Book
    {
        int id;
        String book_name;
        String writer_name;
        Book(int id, String book_name, String writer_name)
        {
            this.id = id;
            this.book_name = book_name;
            this.writer_name = writer_name;
        }
    }
    private void initialBooks()
    {
        Book book1 = new Book(1, "HarryPotter", "Royalroy");
        Book book2 = new Book(2, "Enchanted", "Royal");
        Book book3 = new Book(3, "Pool", "Ali");
        Book book4 = new Book(4, "Party", "Abbas");
        Book book5 = new Book(5, "Once", "Anil");
        library.put(book1.book_name, book1);
        library.put(book2.book_name, book2);
        library.put(book3.book_name, book3);
        library.put(book4.book_name, book4);
        library.put(book5.book_name, book5);
    }
    private void print()
    {
        System.out.println("1. for show details");
        System.out.println("2. for add book");
        System.out.println("3. for delete book");
        System.out.println("4. for see all books with full detail");
        System.out.println("5. for see all books");
        System.out.println("6. for book issue from library");
        System.out.println("7. for book issued from library");
        System.out.println("8. for book return");
        System.out.println("0. for exit");
    }
    private void showDetails()
    {
        initialBooks();
        print();
        System.out.print("Enter your choice : ");
        int condition = sc.nextInt();
        System.out.println();
        while(condition!=0)
        {
            switch(condition)
            {
                case 1:
                    System.out.println("--------Show details--------");
                    print();
                    break;
                case 2:
                    System.out.println("--------Add book-------");
                    addBook();
                    break;
                case 3:
                    System.out.println("--------Delete book-------");
                    deleteBook();
                    break;
                case 4:
                    System.out.println("--------All books with full detail-------");
                    seeAllBooks();
                    break;
                case 5:
                    System.out.println("--------All books-------");
                    bookList();
                    break;
                case 6:
                    System.out.println("--------Book issue from library-------");
                    issueBook();
                    break;
                case 7:
                    System.out.println("--------Book issued from library-------");
                    issuedBook();
                    break;
                case 8:
                    System.out.println("--------Book return-------");
                    returnBook();
                    break;
                default:
                    System.out.println("Sorry! wrong input");
                    break;
            }
                System.out.print("Enter your choice : ");
                condition = sc.nextInt();
        }
    }
    private Book createBook(int id, String book_name, String writer_name)
    {
        Book book = new Book(id, book_name, writer_name);
        return book;
    }
    private void addBook()
    {
        System.out.println("Enter book id : ");
        int id = sc.nextInt();
        System.out.println("Enter book name : ");
        String book_name = sc.next();
        System.out.println("Enter book writer name : ");
        String writer_name = sc.next();
        Book book = createBook(id, book_name, writer_name);
        library.put(book.book_name, book);
    }
    private void seeAllBooks()
    {
        if(library.isEmpty())
        {
            System.out.println("No book is availabe");
            return;
        }
        for(String key : library.keySet())
        {
            Book book = library.get(key);
            System.out.println("Id="+book.id+" book_name="+book.book_name+" writer="+book.writer_name);
        }
    }
    private void bookList()
    {
        if(library.isEmpty())
        {
            System.out.println("No book available");
            return;
        }
        for(String key : library.keySet())
        {
            System.out.println(key);
        }
    }
    private void deleteBook()
    {
        if(library.isEmpty())
        {
            System.out.println("There is no book in library for delete");
            return;
        }
        System.out.println("Enter your book name");
        String book_name = sc.next();
        if(library.containsKey(book_name))
        {
            library.remove(book_name);
            System.out.println(book_name+" book deleted successfully");
        }else
        {
            System.out.println(book_name+ " book is not available in library right now");
        }
    }
    private void issueBook()
    {
        if(library.isEmpty())
        {
            System.out.println("There is no book available in library right now");
            return;
        }
        System.out.println("Enter your book name");
        String book_name = sc.next();
        if(library.containsKey(book_name))
        {
            Book book = library.remove(book_name);
            issueLibrary.put(book_name, book);
            System.out.println(book_name+" book issued successfully");
        }else
        {
            System.out.println(book_name+ " book is not available in library right now");
        }
    }
    private void issuedBook()
    {
        if(issueLibrary.isEmpty())
        {
            System.out.println("No book is issued till now");
            return;
        }else
        {
            System.out.println("Issued list is written below");
            for(String key:issueLibrary.keySet())
            {
                System.out.println(key);
            }
        }
    }
    private void returnBook()
    {
        if(issueLibrary.isEmpty())
        {
            System.out.println("No book is issued till now");
            return;
        }
        System.out.println("Enter book name");
        String book_name = sc.next();
        if(issueLibrary.containsKey(book_name))
        {
            library.put(book_name, issueLibrary.remove(book_name));
            System.out.println(book_name+" returned successfully");
        }else
        {
            System.out.println("This book is not issued till now");
        }

    }
    public static void main(String[] args) {
        LibraryManagement m = new LibraryManagement();
        m.showDetails();
    }
}