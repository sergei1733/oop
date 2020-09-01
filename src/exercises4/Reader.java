package exercises4;

public class Reader {
    private String fio, faculty;
    private int libraryCardNumber;
    private String dateOfBirht;
    private int phone;

    public Reader(String fio,String faculty, String dateOfBirht, int libraryCardNumber, int phone){
        this.fio = fio;
        this.faculty = faculty;
        this.dateOfBirht = dateOfBirht;
        this.libraryCardNumber = libraryCardNumber;
        this.phone = phone;
    }

    public void takeBook(Reader person, int count){
        System.out.println(person.fio +" взял "+count +" книг");
    }
    public void takeBook(Reader person, String ...bookName){
        int count = 0;
        System.out.print(person.fio +" взял книги: ");
        for (String book : bookName) {
             count ++;
            System.out.print(bookName.length == count? book+". ": book+", ");
        }
        System.out.println();
    }
    public void returnBook(Reader person, int count){
        System.out.println(person.fio + " вернул "+ count +" книги.");
    }
    public void returnBook(Reader person, String ...bookName){
        int count = 0;
        System.out.print(person.fio +" вернул книги: ");
        for (String book : bookName) {
            count ++;
            System.out.print(bookName.length == count? book+". ": book+", ");
        }
        System.out.println();
    }
    public void returnBook(Reader person, Book ...nameBook){
        int count = 0;
        System.out.print(person.fio +" вернул книги: ");
        for (Book book : nameBook) {
            count ++;
            System.out.print(nameBook.length == count? book.bookName_1+". ": book.bookName_1+", ");
        }
        System.out.println();
    }


}
