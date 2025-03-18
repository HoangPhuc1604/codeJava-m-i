import java.util.ArrayList;

// Lớp cơ sở dữ liệu giả để lưu trữ đặt phòng
public class MemoryKSDB {
    static ArrayList<DatPhongTheoGio> databaseDatPhongTheoGio = new ArrayList<>();
    static ArrayList<DatPhongTheoNgay> databaseDatPhongTheoNgay = new ArrayList<>();

    // Thêm đặt phòng theo giờ
    static void addKSTheoGio(DatPhongTheoGio ks) {
        databaseDatPhongTheoGio.add(ks);
    }

    // Thêm đặt phòng theo ngày
    static void addKSTheoNgay(DatPhongTheoNgay ks) {
        databaseDatPhongTheoNgay.add(ks);
    }

    // Lấy danh sách đặt phòng theo giờ
    static ArrayList<DatPhongTheoGio> getKSTheoGio() {
        return databaseDatPhongTheoGio;
    }

    // Lấy danh sách đặt phòng theo ngày
    static ArrayList<DatPhongTheoNgay> getKSTheoNgay() {
        return databaseDatPhongTheoNgay;
    }
    
 // Tìm kiếm đặt phòng theo mã
    static DatPhong findKS(int maDatPhong) {
        for (DatPhongTheoGio ks : databaseDatPhongTheoGio) {
            if (ks.maDatPhong == maDatPhong) {
                return ks; // Trả về đặt phòng theo giờ
            }
        }
        for (DatPhongTheoNgay ks : databaseDatPhongTheoNgay) {
            if (ks.maDatPhong == maDatPhong) {
                return ks; // Trả về đặt phòng theo ngày
            }
        }
        return null; // Không tìm thấy đặt phòng
    }
    
    // Xóa đặt phòng theo mã
    static boolean deleteKS(int maDatPhong) {
        // Logic xóa
        for (DatPhongTheoGio ks : databaseDatPhongTheoGio) {
            if (ks.maDatPhong == maDatPhong) {
                databaseDatPhongTheoGio.remove(ks);
                return true;
            }
        }
        for (DatPhongTheoNgay ks : databaseDatPhongTheoNgay) {
            if (ks.maDatPhong == maDatPhong) {
                databaseDatPhongTheoNgay.remove(ks);
                return true;
            }
        }
        return false;
    }

    // Cập nhật thông tin đặt phòng theo mã
    static boolean updateKS(int maDatPhong, String tenKhach, String soPhong, double gia, int soGio, int soNgay) {
        // Logic cập nhật
        for (DatPhongTheoGio ks : databaseDatPhongTheoGio) {
            if (ks.maDatPhong == maDatPhong) {
                ks.tenKhach = tenKhach;
                ks.soPhong = soPhong;
                ks.donGia = gia;
                ks.soGio = soGio;
                return true;
            }
        }
        for (DatPhongTheoNgay ks : databaseDatPhongTheoNgay) {
            if (ks.maDatPhong == maDatPhong) {
                ks.tenKhach = tenKhach;
                ks.soPhong = soPhong;
                ks.donGia = gia;
                ks.soNgay = soNgay;
                return true;
            }
        }
        return false;
    }

    // Đếm số lượng đặt phòng
    static int countDatPhong() {
        return databaseDatPhongTheoGio.size() + databaseDatPhongTheoNgay.size();
    }

    // Tính trung bình hóa đơn theo tháng
    static double averageHoaDonTheoThang(int thang) {
        double total = 0;
        int count = 0;

        for (DatPhongTheoGio ks : databaseDatPhongTheoGio) {
            if (ks.getThang() == thang) {
                total += ks.tinhTongHoaDon();
                count++;
            }
        }

        for (DatPhongTheoNgay ks : databaseDatPhongTheoNgay) {
            if (ks.getThang() == thang) {
                total += ks.tinhTongHoaDon();
                count++;
            }
        }

        return count > 0 ? total / count : 0; // Trả về trung bình nếu có hóa đơn
    }
}