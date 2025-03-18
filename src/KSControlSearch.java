import java.io.PrintWriter;

// Lớp điều khiển cho chức năng tìm kiếm đặt phòng
public class KSControlSearch {
    PrintWriter out;
    KSStorageSearch ksStorageSearch;
    KSOutSearch ksOutSearch;
    
    public KSControlSearch(PrintWriter out) {
        out = out;
        ksStorageSearch = new KSStorageSearch();
        ksOutSearch = new KSOutSearch(out);
    }

    // Phương thức tìm kiếm đặt phòng theo mã
    public void search(int maDatPhong) {
        DatPhong datPhong = ksStorageSearch.timKiemDatPhong(maDatPhong);
        ksOutSearch.printSearch(datPhong);
    }
}