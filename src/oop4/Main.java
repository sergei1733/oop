package oop4;

public class Main {
    public static void main(String[] args) {
    Reader person1 = new Reader("Иванов И.И.","матемарика","01.01.2010",15,568978);


    person1.takeBook(person1,3);
    person1.takeBook(person1, "book1","book2","book3");
    person1.returnBook(person1,3);
    person1.returnBook(person1,"Приключения","Сказки");

    Book book1 = new Book("Сказки", "Пушкин");
    Book book2 = new Book("Рассказы","Лермонтов");

    person1.returnBook(person1,book1,book2);

    }
}
