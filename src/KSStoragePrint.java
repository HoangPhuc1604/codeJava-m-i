import java.util.ArrayList;

public class KSStoragePrint {
	ArrayList<DatPhongTheoGio> getDSKSTheoGio() {
		return MemoryKSDB.getKSTheoGio();
	}

	ArrayList<DatPhongTheoNgay> getDSKSTheoNgay() {
		return MemoryKSDB.getKSTheoNgay();
	}
}