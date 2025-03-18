import java.io.PrintWriter;

// Lớp đầu ra cho chức năng cập nhật đặt phòng
public class KSOutUpdate {
    private PrintWriter out;

    public KSOutUpdate(PrintWriter out) {
        this.out = out;
    }

    public void printUpdate(boolean success, int maDatPhong) {
        if (success) {
            out.println("Đã cập nhật thành công đặt phòng với mã: " + maDatPhong);
        } else {
            out.println("Không tìm thấy đặt phòng với mã: " + maDatPhong);
        }
        out.flush();
    }
}