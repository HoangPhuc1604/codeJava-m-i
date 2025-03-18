import java.io.PrintWriter;

public class KSOut {
	PrintWriter out;

	KSOut() {
		out = new PrintWriter(System.out);
	}

	void thongBao(DatPhongTheoGio ks) {
		out.println("Đã thêm thành công đặt phòng theo giờ!");
		out.flush();
		out.println(ks);
		out.flush();
	}

	void thongBao(DatPhongTheoNgay ks) {
		out.println("Đã thêm thành công đặt phòng theo ngày!");
		out.flush();
		out.println(ks);
		out.flush();
	}
}