import java.io.PrintWriter;
import java.util.Scanner;

// Lớp menu chính để điều khiển chương trình
public class KSMenu {
    PrintWriter out;
    Scanner in;
    String prompt;
    KSInput ksInput;
    KSControlPrint ksControlPrint;

    KSMenu() {
        out = new PrintWriter(System.out);
        in = new Scanner(System.in);
        prompt = "->";
        ksInput = new KSInput();
        ksControlPrint = new KSControlPrint();
    }

    // Vòng lặp điều khiển menu
    void controlLoop() {
        out.println("Gõ 'help' để được hỗ trợ!");
        out.flush();

        while (true) {
            out.print(prompt);
            out.flush();
            String command = in.nextLine().trim();

            if ("help".equalsIgnoreCase(command)) {
                help();
                continue;
            }
            if ("quit".equalsIgnoreCase(command)) {
                break;
            }
            if ("add".equalsIgnoreCase(command)) {
                add();
                continue;
            }
            if ("print".equalsIgnoreCase(command)) {
                print();
                continue;
            }
            if ("delete".equalsIgnoreCase(command)) {
                delete();
                continue;
            }
            if ("update".equalsIgnoreCase(command)) {
                update();
                continue;
            }
            if ("count".equalsIgnoreCase(command)) {
                count();
                continue;
            }
            if ("average".equalsIgnoreCase(command)) {
                average();
                continue;
            }
        }
    }

    private void print() {
        ksControlPrint.printKS(); // In tất cả đặt phòng
    }

    private void add() {
        ksInput.input(); // Nhập dữ liệu thêm đặt phòng
    }

    private void delete() {
        out.print("[NHẬP MÃ ĐẶT PHÒNG ĐỂ XÓA]: ");
        out.flush();
        int maDatPhong = in.nextInt();
        in.nextLine(); // consume newline

        if (MemoryKSDB.deleteKS(maDatPhong)) { // Gọi trực tiếp từ MemoryKSDB
            out.println("Đã xóa thành công đặt phòng với mã: " + maDatPhong);
        } else {
            out.println("Không tìm thấy đặt phòng với mã: " + maDatPhong);
        }
        out.flush();
    }

    private void update() {
        out.print("[NHẬP MÃ ĐẶT PHÒNG ĐỂ CẬP NHẬT]: ");
        out.flush();
        int maDatPhong = in.nextInt();
        in.nextLine(); // consume newline

        out.print("[NHẬP TÊN KHÁCH MỚI]: ");
        out.flush();
        String tenKhach = in.nextLine();

        out.print("[NHẬP SỐ PHÒNG MỚI]: ");
        out.flush();
        String soPhong = in.nextLine();

        out.print("[NHẬP GIÁ MỚI]: ");
        out.flush();
        double gia = in.nextDouble();
        in.nextLine(); // consume newline

        out.print("[NHẬP SỐ GIỜ MỚI]: ");
        out.flush();
        int soGio = in.nextInt();
        in.nextLine(); // consume newline

        out.print("[NHẬP SỐ NGÀY MỚI]: ");
        out.flush();
        int soNgay = in.nextInt();
        in.nextLine(); // consume newline

        out.print("[NHẬP SỐ THÁNG MỚI]: ");
        out.flush();
        int soThang = in.nextInt();
        in.nextLine(); // consume newline

        // Cập nhật thông tin đặt phòng
        if (MemoryKSDB.updateKS(maDatPhong, tenKhach, soPhong, gia, soGio, soNgay)) { // Gọi trực tiếp từ MemoryKSDB
            out.println("Đã cập nhật thành công đặt phòng với mã: " + maDatPhong);
        } else {
            out.println("Không tìm thấy đặt phòng với mã: " + maDatPhong);
        }
        out.flush();
    }

    private void count() {
        // Đếm số lượng đặt phòng
        int total = MemoryKSDB.countDatPhong(); // Gọi trực tiếp từ MemoryKSDB
        out.println("Tổng số lượng đặt phòng: " + total);
        out.flush();
    }

    private void average() {
        out.print("[NHẬP THÁNG ĐỂ TÍNH TRUNG BÌNH]: ");
        out.flush();
        int thang = in.nextInt();

        double average = MemoryKSDB.averageHoaDonTheoThang(thang); // Gọi trực tiếp từ MemoryKSDB
        out.println("Trung bình hóa đơn trong tháng " + thang + ": " + average);
        out.flush();
    }

    private void help() {
        // Hiển thị menu hỗ trợ
        out.println("~~~~~~~~Menu Hỗ Trợ Người Dùng~~~~~~~~");
        out.flush();
        out.println("[HELP] Hướng dẫn sử dụng phần mềm");
        out.flush();
        out.println("[ADD] Thêm mới một đặt phòng");
        out.flush();
        out.println("[PRINT] In tất cả đặt phòng");
        out.flush();
        out.println("[DELETE] Xóa hóa đơn theo mã");
        out.flush();
        out.println("[UPDATE] Sửa hóa đơn theo mã");
        out.flush();
        out.println("[COUNT] Tính tổng số lượng đặt phòng");
        out.flush();
        out.println("[AVERAGE] Tính hóa đơn trung bình theo tháng");
        out.flush();
        out.println("[QUIT] Thoát khỏi phần mềm");
        out.flush();
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.flush();
    }
}