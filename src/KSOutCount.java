import java.io.PrintWriter;

// Lớp đầu ra cho chức năng đếm đặt phòng
public class KSOutCount {
    private PrintWriter out;

    public KSOutCount(PrintWriter out) {
        this.out = out;
    }

    public void printCount(int total) {
        out.println("Tổng số lượng đặt phòng: " + total);
        out.flush();
    }
}