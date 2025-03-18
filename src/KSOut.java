import java.io.PrintWriter;

// Lớp đầu ra để thông báo kết quả thêm đặt phòng
public class KSOut {
    PrintWriter out;

    public KSOut() {
        out = new PrintWriter(System.out);
    }

    // Thông báo khi thêm đặt phòng theo giờ
    void thongBao(DatPhongTheoGio ks) {
        out.println("Đã thêm thành công đặt phòng theo giờ!");
        out.flush();
        out.println(ks);
        out.flush();
    }

    // Thông báo khi thêm đặt phòng theo ngày
    void thongBao(DatPhongTheoNgay ks) {
        out.println("Đã thêm thành công đặt phòng theo ngày!");
        out.flush();
        out.println(ks);
        out.flush();
    }
}