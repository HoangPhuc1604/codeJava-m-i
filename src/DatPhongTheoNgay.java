public class DatPhongTheoNgay extends DatPhong {
	int soNgay;
	int thang;

	DatPhongTheoNgay(int _maDatPhong, String _tenKhach, String _soPhong, double _donGia, int _soNgay, int _thang) {
		super(_maDatPhong, _tenKhach, _soPhong, _donGia);
		soNgay = _soNgay;
		this.thang = _thang;
	}

	@Override
	double tinhTongHoaDon() {
		if (soNgay > 7) {
			return donGia * soNgay * 0.8;
		}
		return donGia * soNgay;
	}

	public int getThang() {
		return thang;
	}

	@Override
	public String toString() {
		return super.toString() + "\n[SỐ NGÀY THUÊ]: " + soNgay + " ngày";
	}
}