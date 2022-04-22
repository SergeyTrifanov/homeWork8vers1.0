package ru.skypro;

public class Book {
    private String nameBook;
    private Author bookAuthor;
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
    public String toString(){
        return "[" + this.nameBook + " " + this.bookAuthor + " " + this.pubDay + "]";
    }
}
