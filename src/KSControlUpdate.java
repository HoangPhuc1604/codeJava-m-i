import java.io.PrintWriter;

// Lớp điều khiển cho chức năng cập nhật đặt phòng
public class KSControlUpdate {
    PrintWriter out;
    KSStorageUpdate ksStorageUpdate;
    KSOutUpdate ksOutUpdate;

    public KSControlUpdate(PrintWriter out) {
        out = out;
        ksStorageUpdate = new KSStorageUpdate();
        ksOutUpdate = new KSOutUpdate(out);
    }

    // Phương thức cập nhật thông tin đặt phòng
    public void update(int maDatPhong, String tenKhach, String soPhong, double gia, int soGio, int soNgay) {
        boolean success = ksStorageUpdate.updateDatPhong(maDatPhong, tenKhach, soPhong, gia, soGio, soNgay);
        ksOutUpdate.printUpdate(success, maDatPhong);
    }
}