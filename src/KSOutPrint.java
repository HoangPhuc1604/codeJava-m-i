import java.io.PrintWriter;
import java.util.ArrayList;

// Lớp đầu ra để in tất cả đặt phòng
public class KSOutPrint {
    PrintWriter out;

    public KSOutPrint() {
        out = new PrintWriter(System.out);
    }

    // In tất cả đặt phòng theo giờ và theo ngày
    void printAllKS(ArrayList<DatPhongTheoGio> dsGio, ArrayList<DatPhongTheoNgay> dsNgay) {
        for (DatPhongTheoGio ksTheoGio : dsGio) {
            out.println(ksTheoGio);
            out.flush();
        }

        for (DatPhongTheoNgay ksTheoNgay : dsNgay) {
            out.println(ksTheoNgay);
            out.flush();
        }
    }
}