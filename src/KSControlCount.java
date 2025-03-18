import java.io.PrintWriter;

// Lớp điều khiển cho chức năng đếm đặt phòng
public class KSControlCount {
    PrintWriter out;
    KSStorageCount ksStorageCount;
    KSOutCount ksOutCount;

    // Constructor
    public KSControlCount(PrintWriter out) {
        out = out;
        ksStorageCount = new KSStorageCount();
        ksOutCount = new KSOutCount(out);
    }

    // Phương thức đếm số lượng đặt phòng
    public void count() {
        int total = ksStorageCount.countDatPhong();
        ksOutCount.printCount(total);
    }
}