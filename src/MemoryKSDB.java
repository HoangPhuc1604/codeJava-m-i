import java.util.ArrayList;

public class MemoryKSDB {
	static ArrayList<DatPhongTheoGio> databaseDatPhongTheoGio = new ArrayList<>();
	static ArrayList<DatPhongTheoNgay> databaseDatPhongTheoNgay = new ArrayList<>();

	static void addKSTheoGio(DatPhongTheoGio ks) {
		databaseDatPhongTheoGio.add(ks);
	}

	static void addKSTheoNgay(DatPhongTheoNgay ks) {
		databaseDatPhongTheoNgay.add(ks);
	}

	static ArrayList<DatPhongTheoGio> getKSTheoGio() {
		return databaseDatPhongTheoGio;
	}

	static ArrayList<DatPhongTheoNgay> getKSTheoNgay() {
		return databaseDatPhongTheoNgay;
	}

	static boolean deleteKS(int maDatPhong) {
		// Logic xóa
		for (DatPhongTheoGio ks : databaseDatPhongTheoGio) {
			if (ks.maDatPhong == maDatPhong) {
				databaseDatPhongTheoGio.remove(ks);
				return true;
			}
		}
		for (DatPhongTheoNgay ks : databaseDatPhongTheoNgay) {
			if (ks.maDatPhong == maDatPhong) {
				databaseDatPhongTheoNgay.remove(ks);
				return true;
			}
		}
		return false;
	}

	static boolean updateKS(int maDatPhong, String tenKhach, String soPhong, double gia, int soGio, int soNgay) {
		// Logic cập nhật
		for (DatPhongTheoGio ks : databaseDatPhongTheoGio) {
			if (ks.maDatPhong == maDatPhong) {
				ks.tenKhach = tenKhach;
				ks.soPhong = soPhong;
				ks.donGia = gia;
				ks.soGio = soGio;
				return true;
			}
		}
		for (DatPhongTheoNgay ks : databaseDatPhongTheoNgay) {
			if (ks.maDatPhong == maDatPhong) {
				ks.tenKhach = tenKhach;
				ks.soPhong = soPhong;
				ks.donGia = gia;
				ks.soNgay = soNgay;
				return true;
			}
		}
		return false;
	}

	static int countDatPhong() {
		return databaseDatPhongTheoGio.size() + databaseDatPhongTheoNgay.size();
	}

	static double averageHoaDonTheoThang(int thang) {
		// Logic tính trung bình
		double total = 0;
		int count = 0;

		for (DatPhongTheoGio ks : databaseDatPhongTheoGio) {
			if (ks.getThang() == thang) {
				total += ks.tinhTongHoaDon();
				count++;
			}
		}

		for (DatPhongTheoNgay ks : databaseDatPhongTheoNgay) {
			if (ks.getThang() == thang) {
				total += ks.tinhTongHoaDon();
				count++;
			}
		}

		return count > 0 ? total / count : 0;
	}
}