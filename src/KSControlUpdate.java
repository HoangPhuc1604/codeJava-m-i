import java.io.PrintWriter;

public class KSControlUpdate {
	private PrintWriter out;
	private KSStorageUpdate ksStorageUpdate;
	private KSOutUpdate ksOutUpdate;

	public KSControlUpdate(PrintWriter out) {
		this.out = out;
		this.ksStorageUpdate = new KSStorageUpdate();
		this.ksOutUpdate = new KSOutUpdate(out);
	}

	public void update() {
		ksStorageUpdate.updateDatPhong();
		ksOutUpdate.printUpdate();
	}
}