public class Sinhvien {
    int mssv;
    String hovaten;
    long sdt;

    Sinhvien(int ms, String ten, long dt) {
        mssv = ms;
        hovaten = ten;
        sdt = dt;
    }

    void inthongtin() {
        System.out.println("msvv: " + mssv + "\n ho va ten: " + hovaten + "\n dthoai: " + sdt);
    }

    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien(123, "Minh", 123456789);

        // sv1.khoitaosv(123, "Khoa", 12345);

        sv1.inthongtin();
    }
}
