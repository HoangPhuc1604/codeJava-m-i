import java.io.PrintWriter;

public class KSControlCount {
	private PrintWriter out;
	private KSStorageCount ksStorageCount;
	private KSOutCount ksOutCount;

	public KSControlCount(PrintWriter out) {
		this.out = out;
		this.ksStorageCount = new KSStorageCount();
		this.ksOutCount = new KSOutCount(out);
	}

	public void count() {
		ksStorageCount.countDatPhong();
		ksOutCount.printCount();
	}
}