import java.util.ArrayList;

// Lớp điều khiển cho chức năng in tất cả đặt phòng
public class KSControlPrint {
    KSStoragePrint ksStoragePrint;
    KSOutPrint ksOutPrint;

    public KSControlPrint() {
        ksStoragePrint = new KSStoragePrint();
        ksOutPrint = new KSOutPrint();
    }

    // Phương thức in tất cả đặt phòng
    void printKS() {
        ArrayList<DatPhongTheoGio> dsDatPhongTheoGio = ksStoragePrint.getDSKSTheoGio();
        ArrayList<DatPhongTheoNgay> dsDatPhongTheoNgay = ksStoragePrint.getDSKSTheoNgay();
        ksOutPrint.printAllKS(dsDatPhongTheoGio, dsDatPhongTheoNgay);
    }
}