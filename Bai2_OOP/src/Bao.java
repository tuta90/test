import java.util.Scanner;

public class Bao extends TaiLieu {
    private int dayIssue;

    public Bao(String id, String publishing, int number, int dayIssue) {
        super(id, publishing, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "dayIssue=" + dayIssue +
                ", id='" + id + '\'' +
                ", publishing='" + publishing + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public void input() {
        super.input();

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao ngay phat hanh: ");
        dayIssue = Integer.parseInt(scan.nextLine());
    }
}
