// Lớp trừu tượng đại diện cho một đặt phòng
public abstract class DatPhong {
    int maDatPhong; // Mã đặt phòng
    String tenKhach; // Tên khách
    String soPhong; // Số phòng
    double donGia; // Đơn giá

    // Constructor
    DatPhong(int _maDatPhong, String _tenKhach, String _soPhong, double _donGia) {
        maDatPhong = _maDatPhong;
        tenKhach = _tenKhach;
        soPhong = _soPhong;
        donGia = _donGia;
    }

    // Phương thức trừu tượng để tính tổng hóa đơn
    abstract double tinhTongHoaDon();

    @Override
    public String toString() {
        return "[MÃ ĐẶT PHÒNG]: " + maDatPhong + "\n" + "[TÊN KHÁCH]: " + tenKhach + "\n" + "[SỐ PHÒNG]: " + soPhong
                + "\n" + "[GIÁ]: " + donGia;
    }
}