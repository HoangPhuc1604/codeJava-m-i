import java.io.PrintWriter;

// Lớp đầu ra cho chức năng tính trung bình hóa đơn
public class KSOutAverage {
    private PrintWriter out;

    public KSOutAverage(PrintWriter out) {
        this.out = out;
    }

    public void printAverage(double average, int thang) {
        out.println("Trung bình hóa đơn trong tháng " + thang + ": " + average);
        out.flush();
    }
}