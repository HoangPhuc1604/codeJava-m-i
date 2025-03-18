import java.io.PrintWriter;

public class KSOutDelete {
	private PrintWriter out;

	public KSOutDelete(PrintWriter out) {
		this.out = out;
	}

	public void printDelete() {
		out.println("Xóa đã hoàn tất!");
	}
}