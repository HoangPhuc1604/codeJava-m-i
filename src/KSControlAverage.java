import java.io.PrintWriter;

// Lớp điều khiển cho chức năng tính trung bình hóa đơn
public class KSControlAverage {
    private PrintWriter out;
    private KSStorageAverage ksStorageAverage;
    private KSOutAverage ksOutAverage;

    public KSControlAverage(PrintWriter out) {
        this.out = out;
        this.ksStorageAverage = new KSStorageAverage();
        this.ksOutAverage = new KSOutAverage(out);
    }

    // Phương thức tính trung bình hóa đơn theo tháng
    public void average(int thang) {
        double average = ksStorageAverage.averageHoaDonTheoThang(thang);
        ksOutAverage.printAverage(average, thang);
    }
}