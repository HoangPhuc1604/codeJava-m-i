// Lớp lưu trữ cho chức năng cập nhật đặt phòng
public class KSStorageUpdate {
    public boolean updateDatPhong(int maDatPhong, String tenKhach, String soPhong, double gia, int soGio, int soNgay) {
        return MemoryKSDB.updateKS(maDatPhong, tenKhach, soPhong, gia, soGio, soNgay); // Cập nhật đặt phòng trong cơ sở dữ liệu
    }
}