package run;

import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("A1", "Lập trình PHP", 10, "Nam", "PHP", 5);
        books[1] = new ProgrammingBook("A2", "Lập trình Java", 125, "Nam", "Java", 6);
        books[2] = new ProgrammingBook("A3", "Lập trình JavaScript", 150, "Nam", "JavaScript", 7);
        books[3] = new ProgrammingBook("A4", "Lập trình Python", 40, "Nam", "Python", 8);
        books[4] = new ProgrammingBook("A2", "Lập trình Java", 125, "Nam", "Java", 6);
        books[5] = new FictionBook("A6", "Viễn tưởng 1", 60, "Hoàng", "Viễn tưởng 1");
        books[6] = new FictionBook("A7", "Viễn tưởng 2", 60, "Hoàng", "Viễn tưởng 1");
        books[7] = new FictionBook("A8", "Viễn tưởng 3", 60, "Hoàng", "Viễn tưởng 1");
        books[8] = new FictionBook("A9", "Viễn tưởng 4", 160, "Hoàng", "Viễn tưởng 4");
        books[9] = new FictionBook("A10", "Viễn tưởng 5", 180, "Hoàng", "Viễn tưởng 5");
        Scanner input = new Scanner(System.in);
        for (Book i : books) {
            System.out.println(i);
        }
        System.out.println("Tổng tiền của 10 quyển sách là : " + sum(books));
        System.out.print("Nhập ngôn ngữ có trong ProgrammingBook : ");
        String check = input.nextLine();
        System.out.println("Số sách ProgrammingBook có language " + check + " là:" + sumJava(books, check));
        System.out.print("Nhập category có trong FictionBook : ");
        String checkOne = input.nextLine();
        System.out.println("Số sách có category " + checkOne + " là: " + sumVienTuong1(books, checkOne));
        System.out.print("Nhập vào giá cần kiểm tra  : ");
        double number = input.nextDouble();
        System.out.println("Số sách Fiction có giá < " + number + " là: " + sumFic100(books, number));
    }

    public static double sum(Book[] arr) {
        double sum = 0;
        for (Book i : arr
        ) {
            sum += i.getPrice();
        }
        return sum;
    }

    public static int sumJava(Book[] arr, String check) {
        int sum = 0;
        for (Book book : arr) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals(check)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int sumVienTuong1(Book[] arr, String checkOne) {
        int sum = 0;
        for (Book book : arr) {
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals(checkOne)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int sumFic100(Book[] arr, double number) {
        int sum = 0;
        for (Book book : arr) {
            if (book instanceof FictionBook) {
                if (book.getPrice() < number) {
                    sum++;
                }
            }
        }
        return sum;
    }

}