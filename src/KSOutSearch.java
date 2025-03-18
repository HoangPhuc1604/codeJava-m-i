import java.io.PrintWriter;

// Lớp đầu ra cho chức năng tìm kiếm đặt phòng
public class KSOutSearch {
    PrintWriter out;

    public KSOutSearch(PrintWriter out) {
        this.out = out;
    }

    void printSearch(DatPhong datPhong) {
        if (datPhong != null) {
            out.println("Thông tin đặt phòng: " + datPhong);
        } else {
            out.println("Không tìm thấy đặt phòng.");
        }
        out.flush();
    }
}