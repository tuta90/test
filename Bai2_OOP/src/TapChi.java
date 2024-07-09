import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int issueNumber;
    private int monthIssue;


    public TapChi(String id, String publishing, int number, int issueNumber, int monthIssue) {
        super(id, publishing, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", publishing='" + publishing + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public void input() {
        super.input();

        Scanner scan = new Scanner(System.in);
        System.out.println(" Nhap vao so phat hanh:");
        System.out.println(" Nhap vao thang phat hanh:");
        issueNumber = Integer.parseInt(scan.nextLine());
        monthIssue = Integer.parseInt(scan.nextLine());
    }
}
