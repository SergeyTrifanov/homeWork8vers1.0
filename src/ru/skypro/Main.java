package ru.skypro;

public class Main {


    public static void main(String[] args) {

       Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
      System.out.println("sarah.age = " + sarah.getAge());
       sarah.setAge(31);
      System.out.println("sarah.getAge() = " + sarah.getAge());
      Person john = new Person("John", 13);
        System.out.println();
      /////////// example

        Author author = new Author("Сергей", "Трифанов");
        System.out.println("author " + author);
        Author author1 = new Author("Александр", "Сапунов");
        System.out.println("author " + author1);


        Book nameBook = new Book("эти ошибки", author, 2022);
        nameBook.setPubDay(2020);
        System.out.println("nameBook = " + nameBook);
        Book nameBook1 = new Book("кто я", author1, 2019);
        System.out.println("nameBook1 = " + nameBook1);
        System.out.println();
    }
}
