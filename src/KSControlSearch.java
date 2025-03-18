import java.io.PrintWriter;

// Lớp điều khiển cho chức năng tìm kiếm đặt phòng
public class KSControlSearch {
    private PrintWriter out;
    private KSStorageSearch ksStorageSearch;
    private KSOutSearch ksOutSearch;

    public KSControlSearch(PrintWriter out) {
        this.out = out;
        this.ksStorageSearch = new KSStorageSearch();
        this.ksOutSearch = new KSOutSearch(out);
    }

    // Phương thức tìm kiếm đặt phòng theo mã
    public void search(int maDatPhong) {
        DatPhong datPhong = ksStorageSearch.timKiemDatPhong(maDatPhong);
        ksOutSearch.printSearch(datPhong);
    }
}