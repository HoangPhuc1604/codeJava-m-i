import java.util.Scanner;
import java.io.PrintWriter;

public class KSInput {
	Scanner keyboard;
	PrintWriter out;
	KSStorage ksStorage;
	KSOut ksOut;

	public KSInput() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		ksStorage = new KSStorage();
		ksOut = new KSOut();
	}

	void input() {
		int maDatPhong;
		String tenKhach;
		String soPhong;
		double gia;
		int loaiDatPhong;
		int thang;

		out.print("[NHẬP MÃ ĐẶT PHÒNG]: ");
		out.flush();
		maDatPhong = keyboard.nextInt();
		keyboard.nextLine(); // consume newline

		out.print("[NHẬP TÊN KHÁCH]: ");
		out.flush();
		tenKhach = keyboard.nextLine();

		out.print("[NHẬP SỐ PHÒNG]: ");
		out.flush();
		soPhong = keyboard.nextLine();

		out.print("[NHẬP GIÁ]: ");
		out.flush();
		gia = keyboard.nextDouble();

		out.print("[CHỌN LOẠI ĐẶT PHÒNG (1 - Theo Giờ / 2 - Theo Ngày)]: ");
		out.flush();
		loaiDatPhong = keyboard.nextInt();

		out.print("[CHỌN THÁNG[1-12]: ");
		out.flush();
		thang = keyboard.nextInt();

		if (loaiDatPhong == 1) {
			out.print("[NHẬP SỐ GIỜ]: ");
			out.flush();
			int soGio = keyboard.nextInt();
			DatPhongTheoGio ksTheoGio = new DatPhongTheoGio(maDatPhong, tenKhach, soPhong, gia, soGio, thang);
			ksStorage.insertDatPhongTheoGio(ksTheoGio);
			ksOut.thongBao(ksTheoGio);
		} else if (loaiDatPhong == 2) {
			out.print("[NHẬP SỐ NGÀY]: ");
			out.flush();
			int soNgay = keyboard.nextInt();
			DatPhongTheoNgay ksTheoNgay = new DatPhongTheoNgay(maDatPhong, tenKhach, soPhong, gia, soNgay, thang);
			ksStorage.insertDatPhongTheoNgay(ksTheoNgay);
			ksOut.thongBao(ksTheoNgay);
		} else {
			out.println("Lựa chọn không hợp lệ!");
		}
	}
}