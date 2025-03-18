import java.io.PrintWriter;

public class KSControlDelete {
	private PrintWriter out;
	private KSStorageDelete ksStorageDelete;
	private KSOutDelete ksOutDelete;

	public KSControlDelete(PrintWriter out) {
		this.out = out;
		this.ksStorageDelete = new KSStorageDelete();
		this.ksOutDelete = new KSOutDelete(out);
	}

	public void delete(int maDatPhong) {
		ksStorageDelete.deleteDatPhong(maDatPhong);
		ksOutDelete.printDelete();
	}
}