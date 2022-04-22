package ru.skypro;

public class Book {
    String nameBook;
    Author bookAuthor;
    int pubDay;

    public Book(String nameBook, Author bookAuthor, int pubDay){
        this.nameBook = nameBook;
        this.bookAuthor = bookAuthor;
        this.pubDay = pubDay;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public Author getBookAuthor(){
        return this.bookAuthor;
    }
    public void setPubDay(int pubDay){
        this.pubDay = pubDay;
    }
}
