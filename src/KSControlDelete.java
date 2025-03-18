import java.io.PrintWriter;

// Lớp điều khiển cho chức năng xóa đặt phòng
public class KSControlDelete {
    PrintWriter out;
    KSStorageDelete ksStorageDelete;
    KSOutDelete ksOutDelete;

    public KSControlDelete(PrintWriter out) {
        out = out;
        ksStorageDelete = new KSStorageDelete();
        ksOutDelete = new KSOutDelete(out);
    }

    // Phương thức xóa đặt phòng theo mã
    public void delete(int maDatPhong) {
        boolean success = ksStorageDelete.deleteDatPhong(maDatPhong);
        ksOutDelete.printDelete(success, maDatPhong);
    }
}