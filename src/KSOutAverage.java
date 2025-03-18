import java.io.PrintWriter;

public class KSOutAverage {
	private PrintWriter out;

	public KSOutAverage(PrintWriter out) {
		this.out = out;
	}

	public void printAverage() {
		out.println("Trung bình tiền đã được tính toán!");
	}
}