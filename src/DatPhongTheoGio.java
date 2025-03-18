public class DatPhongTheoGio extends DatPhong {
	int soGio;
	int thang;

	DatPhongTheoGio(int _maDatPhong, String _tenKhach, String _soPhong, double _donGia, int _soGio, int _thang) {
		super(_maDatPhong, _tenKhach, _soPhong, _donGia);
		soGio = _soGio;
		this.thang = _thang;
	}

	@Override
	double tinhTongHoaDon() {
		if (soGio > 30) {
			return 0;
		} else if (soGio > 24) {
			return donGia * 24;
		} else {
			return donGia * soGio;
		}
	}

	public int getThang() {
		return thang;
	}

	@Override
	public String toString() {
		return super.toString() + "\n[THỜI GIAN THUÊ]: " + soGio + " giờ";
	}
}