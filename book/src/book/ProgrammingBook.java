package book;

public class ProgrammingBook extends Book {
    private String language;
    private double framework;

    public ProgrammingBook() {
        super("", "", 0.0, "");
        this.language = "";
        this.framework = 0.0;
    }

    public ProgrammingBook(String code, String name, double price, String author, String language, double framework) {
        super(code, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getFramework() {
        return framework;
    }

    public void setFramework(double framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return  "ProgrammingBook: "+
                " Mã: " + getCode() +
                ",Tên sách: " + getName() +
                ", Giá: " + getPrice() +
                ",Tác giả: " + getAuthor() +
                ", Ngôn ngữ: '" + language +
                ", Khổ sách: " + framework;
    }
}