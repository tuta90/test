import java.util.Scanner;

public class Sach extends TaiLieu {
    private String author;
    private int numberPage;


    public Sach(String id, String publishing, int number, String author, int numberPage) {
        super(id, publishing, number);
        this.author = author;
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "author='" + author + '\'' +
                ", numberPage=" + numberPage +
                ", id='" + id + '\'' +
                ", publishing='" + publishing + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten tac gia: ");
        System.out.println("Nhap so trang: ");
        author = scan.nextLine();
        numberPage = Integer.parseInt(scan.nextLine());
    }
}

