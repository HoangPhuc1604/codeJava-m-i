import java.io.PrintWriter;

public class KSControlSearch {
	private PrintWriter out;
	private KSStorageSearch ksStorageSearch;
	private KSOutSearch ksOutSearch;

	public KSControlSearch(PrintWriter out) {
		this.out = out;
		this.ksStorageSearch = new KSStorageSearch();
		this.ksOutSearch = new KSOutSearch(out);
	}

	public void search() {
		ksStorageSearch.timKiemDatPhong();
		ksOutSearch.printSearch();
	}
}