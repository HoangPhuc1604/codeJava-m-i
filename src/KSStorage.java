public class KSStorage {
	void insertDatPhongTheoGio(DatPhongTheoGio ks) {
		MemoryKSDB.addKSTheoGio(ks);
	}

	void insertDatPhongTheoNgay(DatPhongTheoNgay ks) {
		MemoryKSDB.addKSTheoNgay(ks);
	}

	boolean deleteDatPhong(int maDatPhong) {
		return MemoryKSDB.deleteKS(maDatPhong);
	}

	boolean updateDatPhong(int maDatPhong, String tenKhach, String soPhong, double gia, int soGio, int soNgay) {
		return MemoryKSDB.updateKS(maDatPhong, tenKhach, soPhong, gia, soGio, soNgay);
	}

	int countDatPhong() {
		return MemoryKSDB.countDatPhong();
	}

	double averageHoaDonTheoThang(int thang) {
		return MemoryKSDB.averageHoaDonTheoThang(thang);
	}
}