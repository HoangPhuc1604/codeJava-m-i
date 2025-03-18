import java.io.PrintWriter;

public class KSControlAverage {
	private PrintWriter out;
	private KSStorageAverage ksStorageAverage;
	private KSOutAverage ksOutAverage;

	public KSControlAverage(PrintWriter out) {
		this.out = out;
		this.ksStorageAverage = new KSStorageAverage();
		this.ksOutAverage = new KSOutAverage(out);
	}

	public void average(int thang) {
		ksStorageAverage.averageHoaDonTheoThang(thang);
		ksOutAverage.printAverage();
	}
}