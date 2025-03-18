import java.io.PrintWriter;

public class KSOutUpdate {
	private PrintWriter out;

	public KSOutUpdate(PrintWriter out) {
		this.out = out;
	}

	public void printUpdate() {
		out.println("Cập nhật đã hoàn tất!");
	}
}