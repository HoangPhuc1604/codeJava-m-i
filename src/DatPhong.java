public abstract class DatPhong {
	int maDatPhong;
	String tenKhach;
	String soPhong;
	double donGia;

	DatPhong(int _maDatPhong, String _tenKhach, String _soPhong, double _donGia) {
		maDatPhong = _maDatPhong;
		tenKhach = _tenKhach;
		soPhong = _soPhong;
		donGia = _donGia;
	}

	abstract double tinhTongHoaDon();

	@Override
	public String toString() {
		return "[MÃ ĐẶT PHÒNG]: " + maDatPhong + "\n" + "[TÊN KHÁCH]: " + tenKhach + "\n" + "[SỐ PHÒNG]: " + soPhong
				+ "\n" + "[GIÁ]: " + donGia;
	}
}