import java.io.PrintWriter;

// Lớp đầu ra cho chức năng xóa đặt phòng
public class KSOutDelete {
    PrintWriter out;

    public KSOutDelete(PrintWriter out) {
        this.out = out;
    }

    void printDelete(boolean success, int maDatPhong) {
        if (success) {
            out.println("Đã xóa thành công đặt phòng với mã: " + maDatPhong);
        } else {
            out.println("Không tìm thấy đặt phòng với mã: " + maDatPhong);
        }
        out.flush();
    }
}