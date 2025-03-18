import java.util.ArrayList;

// Lớp lưu trữ cho các chức năng liên quan đến đặt phòng
public class KSStorage {
    // Thêm đặt phòng theo giờ
    void insertDatPhongTheoGio(DatPhongTheoGio ks) {
        MemoryKSDB.addKSTheoGio(ks);
    }

    // Thêm đặt phòng theo ngày
    void insertDatPhongTheoNgay(DatPhongTheoNgay ks) {
        MemoryKSDB.addKSTheoNgay(ks);
    }

}