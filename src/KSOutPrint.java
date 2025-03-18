import java.io.PrintWriter;
import java.util.ArrayList;

public class KSOutPrint {
	PrintWriter out;

	public KSOutPrint() {
		out = new PrintWriter(System.out);
	}

	void printAllKS(ArrayList<DatPhongTheoGio> dsGio, ArrayList<DatPhongTheoNgay> dsNgay) {
		for (DatPhongTheoGio ksTheoGio : dsGio) {
			out.println(ksTheoGio);
			out.flush();
		}

		for (DatPhongTheoNgay ksTheoNgay : dsNgay) {
			out.println(ksTheoNgay);
			out.flush();
		}
	}
}