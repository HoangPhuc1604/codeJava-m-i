import java.util.Scanner;
import java.io.PrintWriter;

// Lớp nhập dữ liệu cho các chức năng
public class KSInput {
    Scanner keyboard;
    PrintWriter out;

    public KSInput() {
        keyboard = new Scanner(System.in);
        out = new PrintWriter(System.out);
    }

    // Phương thức nhập dữ liệu để thêm đặt phòng
    void input() {
        int maDatPhong;
        String tenKhach;
        String soPhong;
        double gia;
        int loaiDatPhong;
        int thang;

        out.print("[NHẬP MÃ ĐẶT PHÒNG]: ");
        out.flush();
        maDatPhong = keyboard.nextInt();
        keyboard.nextLine(); // consume newline

        out.print("[NHẬP TÊN KHÁCH]: ");
        out.flush();
        tenKhach = keyboard.nextLine();

        out.print("[NHẬP SỐ PHÒNG]: ");
        out.flush();
        soPhong = keyboard.nextLine();

        out.print("[NHẬP GIÁ]: ");
        out.flush();
        gia = keyboard.nextDouble();

        out.print("[CHỌN LOẠI ĐẶT PHÒNG (1 - Theo Giờ / 2 - Theo Ngày)]: ");
        out.flush();
        loaiDatPhong = keyboard.nextInt();

        out.print("[NHẬP THÁNG [1-12]]: ");
        out.flush();
        thang = keyboard.nextInt();

        if (loaiDatPhong == 1) {
            out.print("[NHẬP SỐ GIỜ]: ");
            out.flush();
            int soGio = keyboard.nextInt();
            DatPhongTheoGio ksTheoGio = new DatPhongTheoGio(maDatPhong, tenKhach, soPhong, gia, soGio, thang);
            MemoryKSDB.addKSTheoGio(ksTheoGio); // Gọi trực tiếp từ MemoryKSDB
            new KSOut().thongBao(ksTheoGio);
        } else if (loaiDatPhong == 2) {
            out.print("[NHẬP SỐ NGÀY]: ");
            out.flush();
            int soNgay = keyboard.nextInt();
            DatPhongTheoNgay ksTheoNgay = new DatPhongTheoNgay(maDatPhong, tenKhach, soPhong, gia, soNgay, thang);
            MemoryKSDB.addKSTheoNgay(ksTheoNgay); // Gọi trực tiếp từ MemoryKSDB
            new KSOut().thongBao(ksTheoNgay);
        } else {
            out.println("Lựa chọn không hợp lệ!");
        }
    }
}