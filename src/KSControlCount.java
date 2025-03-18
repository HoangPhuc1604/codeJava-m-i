import java.io.PrintWriter;

// Lớp điều khiển cho chức năng đếm đặt phòng
public class KSControlCount {
    private PrintWriter out;
    private KSStorageCount ksStorageCount;
    private KSOutCount ksOutCount;

    // Constructor
    public KSControlCount(PrintWriter out) {
        this.out = out;
        this.ksStorageCount = new KSStorageCount();
        this.ksOutCount = new KSOutCount(out);
    }

    // Phương thức đếm số lượng đặt phòng
    public void count() {
        int total = ksStorageCount.countDatPhong();
        ksOutCount.printCount(total);
    }
}