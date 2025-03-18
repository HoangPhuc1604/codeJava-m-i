import java.util.ArrayList;

// Lớp lưu trữ để lấy danh sách đặt phòng
public class KSStoragePrint {
    // Lấy danh sách đặt phòng theo giờ
    ArrayList<DatPhongTheoGio> getDSKSTheoGio() {
        return MemoryKSDB.getKSTheoGio();
    }

    // Lấy danh sách đặt phòng theo ngày
    ArrayList<DatPhongTheoNgay> getDSKSTheoNgay() {
        return MemoryKSDB.getKSTheoNgay();
    }
}