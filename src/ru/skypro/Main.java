package ru.skypro;

public class Main {


    public static void main(String[] args) {

       Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
      System.out.println("sarah.age = " + sarah.getAge());
       sarah.setAge(31);
      System.out.println("sarah.getAge() = " + sarah.getAge());
      Person john = new Person("John", 13);
      /////////// example

        Author author = new Author("Сергей", "Трифанов");
        System.out.println(author.getFirstName() + " " + author.getSecondName());
        Author author1 = new Author("Александр", "Сапунов");
        System.out.println(author1.getFirstName()+ " " + author1.getSecondName());

        Book nameBook = new Book("эти ошибки", author, 2022);
        System.out.println(nameBook.getNameBook()+ author + nameBook.pubDay);
    }
}
