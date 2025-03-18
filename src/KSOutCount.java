import java.io.PrintWriter;

// Lớp đầu ra cho chức năng đếm đặt phòng
public class KSOutCount {
    PrintWriter out;

    public KSOutCount(PrintWriter out) {
        this.out = out;
    }

    void printCount(int total) {
        out.println("Tổng số lượng đặt phòng: " + total);
        out.flush();
    }
}