// Lớp đại diện cho đặt phòng theo ngày
public class DatPhongTheoNgay extends DatPhong {
    int soNgay; // Số ngày thuê
    int thang; // Tháng

    // Constructor
    DatPhongTheoNgay(int _maDatPhong, String _tenKhach, String _soPhong, double _donGia, int _soNgay, int _thang) {
        super(_maDatPhong, _tenKhach, _soPhong, _donGia);
        soNgay = _soNgay;
        this.thang = _thang;
    }

    // Tính tổng hóa đơn
    @Override
    double tinhTongHoaDon() {
        if (soNgay > 7) {
            return donGia * soNgay * 0.8; // Giảm giá nếu thuê hơn 7 ngày
        }
        return donGia * soNgay; // Tính theo số ngày thực tế
    }

    public int getThang() {
        return thang; // Trả về tháng
    }

    @Override
    public String toString() {
        return super.toString() + "\n[SỐ NGÀY THUÊ]: " + soNgay + " ngày";
    }
}