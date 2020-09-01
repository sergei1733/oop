package exercises4;

public class Book {
    public String bookName_1;  //сделал их видимыми потомучто в задании указано перезать имы книги в метод который в другом классе по другому не мог решить
    public String bookAuthor_1;

    public Book(String bookName, String bookAuthor){
        this.bookName_1 = bookName;
        this.bookAuthor_1 = bookAuthor;
    }
}
