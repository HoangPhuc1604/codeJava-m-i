// Lớp lưu trữ cho chức năng tìm kiếm đặt phòng
public class KSStorageSearch {
    public DatPhong timKiemDatPhong(int maDatPhong) {
        return MemoryKSDB.findKS(maDatPhong); // Tìm kiếm đặt phòng trong cơ sở dữ liệu
    }
}