// Lớp đại diện cho đặt phòng theo giờ
public class DatPhongTheoGio extends DatPhong {
    int soGio; // Số giờ thuê
    int thang; // Tháng

    // Constructor
    DatPhongTheoGio(int _maDatPhong, String _tenKhach, String _soPhong, double _donGia, int _soGio, int _thang) {
        super(_maDatPhong, _tenKhach, _soPhong, _donGia);
        soGio = _soGio;
        this.thang = _thang;
    }

    // Tính tổng hóa đơn
    @Override
    double tinhTongHoaDon() {
        if (soGio > 30) {
            return 0; // Không tính hóa đơn nếu quá 30 giờ
        } else if (soGio > 24) {
            return donGia * 24; // Tính 24 giờ nếu thời gian thuê lớn hơn 24
        } else {
            return donGia * soGio; // Tính theo số giờ thực tế
        }
    }

    public int getThang() {
        return thang; // Trả về tháng
    }

    @Override
    public String toString() {
        return super.toString() + "\n[THỜI GIAN THUÊ]: " + soGio + " giờ";
    }
}