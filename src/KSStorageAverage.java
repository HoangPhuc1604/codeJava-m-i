// Lớp lưu trữ cho chức năng tính trung bình hóa đơn
public class KSStorageAverage {
    public double averageHoaDonTheoThang(int thang) {
        return MemoryKSDB.averageHoaDonTheoThang(thang); // Tính trung bình từ cơ sở dữ liệu
    }
}