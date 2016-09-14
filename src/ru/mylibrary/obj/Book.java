package ru.mylibrary.obj;

/**
 * Created by Vladimir on 14.09.16.
 */
public class Book {
    private Author author;
    private String name;
    private Integer pages;
    private byte[] content;
    private byte[] imgs;


    //конструкторы
    public Book() {
    }

    public Book(Author author, String name, Integer pages, byte[] content, byte[] imgs) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.content = content;
        this.imgs = imgs;
    }


    //get & set
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getImgs() {
        return imgs;
    }

    public void setImgs(byte[] imgs) {
        this.imgs = imgs;
    }
}

