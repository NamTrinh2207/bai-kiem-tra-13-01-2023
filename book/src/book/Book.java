package book;

public class Book {
    private String Code;
    private String name;
    private double price;
    private String author;

    public Book() {
        Code = "";
        this.name = "";
        this.price = 0;
        this.author = "";
    }

    public Book(String code, String name, double price, String author) {
        Code = code;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}