import java.io.PrintWriter;

public class KSOutSearch {
	private PrintWriter out;

	public KSOutSearch(PrintWriter out) {
		this.out = out;
	}

	public void printSearch() {
		out.println("Kết quả tìm kiếm đã được hiển thị!");
	}
}