import java.util.ArrayList;

public class KSControlPrint {
	KSStoragePrint ksStoragePrint;
	KSOutPrint ksOutPrint;

	public KSControlPrint() {
		ksStoragePrint = new KSStoragePrint();
		ksOutPrint = new KSOutPrint();
	}

	void printKS() {
		ArrayList<DatPhongTheoGio> dsDatPhongTheoGio = ksStoragePrint.getDSKSTheoGio();
		ArrayList<DatPhongTheoNgay> dsDatPhongTheoNgay = ksStoragePrint.getDSKSTheoNgay();
		ksOutPrint.printAllKS(dsDatPhongTheoGio, dsDatPhongTheoNgay);
	}
}