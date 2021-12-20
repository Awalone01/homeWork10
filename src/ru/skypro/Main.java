package ru.skypro;

public class Main {

    public static void main(String[] args) {
    Author dumas = new Author("Александр", "Дюма");
    Author govanioli = new Author("Рафаэлло", "Джованьоли");
    Author govaniolio = new Author("Рафаэлло", "Джованьоли");

    Book threeMusketeers = new Book("Три мушкетёра", dumas,  1844);
    Book spartacus = new Book("Спартак", govanioli, 1874);
    System.out.println(threeMusketeers);
    System.out.println(spartacus);
    threeMusketeers.setReleaseOfYear(1850);
    System.out.println("Меняем год публикации");
    System.out.println(threeMusketeers);
        System.out.println("сравнение книг - " + govanioli.equals(govaniolio));
        System.out.println("сравнение книг по хэшкоду - " + (govanioli.hashCode() == govaniolio.hashCode()));
    }
}
