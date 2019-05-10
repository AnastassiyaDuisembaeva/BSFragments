package com.example.bsfragments;

public class Item {
    private String name;
    private String author;
    private String bookGanre;
    private String price;
    private int imageBook;

    public Item(String name, String author, String bookGanre, String price, int imageBook){

        this.name = name;
        this.author = author;
        this.bookGanre = bookGanre;
        this.price = price;
        this.imageBook = imageBook;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getbookGanre() {
        return this.bookGanre;
    }

    public void setbookGanre(String bookGanre) {
        this.bookGanre = bookGanre;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageBook() {
        return this.imageBook;
    }

    public void setImageBook(int imageBook) {
        this.imageBook = imageBook;
    }
}
