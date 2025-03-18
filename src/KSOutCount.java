import java.io.PrintWriter;

public class KSOutCount {
	private PrintWriter out;

	public KSOutCount(PrintWriter out) {
		this.out = out;
	}

	public void printCount() {
		out.println("Tổng số lượng đã được tính toán!");
	}
}