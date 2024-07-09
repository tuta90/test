import java.util.Scanner;

public class TaiLieu {
    protected String id;
    protected String publishing;
    protected int number;

    public TaiLieu(String id, String publishing, int number) {
        this.id = id;
        this.publishing = publishing;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "id='" + id + '\'' +
                ", author='" + publishing + '\'' +
                ", number=" + number +
                '}';
    }
    public void display(){
        System.out.println(this);
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Nhap ma tai lieu: ");
        id = scan.nextLine();
        System.out.println("Nhap ten nxb: ");
        publishing = scan.nextLine();
        System.out.println("So ban phat hanh:");
        number = scan.nextInt();



    }
}
