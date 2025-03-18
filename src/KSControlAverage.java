import java.io.PrintWriter;

// Lớp điều khiển cho chức năng tính trung bình hóa đơn
public class KSControlAverage {
    PrintWriter out;
    KSStorageAverage ksStorageAverage;
    KSOutAverage ksOutAverage;

    public KSControlAverage(PrintWriter out) {
        out = out;
        ksStorageAverage = new KSStorageAverage();
        ksOutAverage = new KSOutAverage(out);
    }

    // Phương thức tính trung bình hóa đơn theo tháng
    public void average(int thang) {
        double average = ksStorageAverage.averageHoaDonTheoThang(thang);
        ksOutAverage.printAverage(average, thang);
    }
}