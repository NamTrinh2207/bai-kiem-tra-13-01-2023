package book;

public class FictionBook extends Book {
    private String category;

    public FictionBook() {
        super("", "", 0.0, "");
        this.category = "";
    }

    public FictionBook(String code, String name, double price, String author, String category) {
        super(code, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook: " +
                " Mã: " + getCode() +
                ",Tên sách: " + getName() +
                ", Giá: " + getPrice() +
                ",Tác giả: " + getAuthor() +
                ", Thể loại: " + category;
    }
}