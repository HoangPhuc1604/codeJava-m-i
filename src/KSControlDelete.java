import java.io.PrintWriter;

// Lớp điều khiển cho chức năng xóa đặt phòng
public class KSControlDelete {
    private PrintWriter out;
    private KSStorageDelete ksStorageDelete;
    private KSOutDelete ksOutDelete;

    public KSControlDelete(PrintWriter out) {
        this.out = out;
        this.ksStorageDelete = new KSStorageDelete();
        this.ksOutDelete = new KSOutDelete(out);
    }

    // Phương thức xóa đặt phòng theo mã
    public void delete(int maDatPhong) {
        boolean success = ksStorageDelete.deleteDatPhong(maDatPhong);
        ksOutDelete.printDelete(success, maDatPhong);
    }
}