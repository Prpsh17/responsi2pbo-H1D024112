class Pengguna {
    // State (variabel)
    int umur;           // dalam tahun
    double berat;       // dalam kg
    double tinggi;      // dalam cm

    // Konstanta faktor aktivitas
    final double faktorAktivitas = 1.2;

    // Constructor
    public Pengguna(int umur, double berat, double tinggi) {
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    // Menghitung BMI
    double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;    // konversi cm ke meter
        return berat / (tinggiMeter * tinggiMeter);
    }

    // Menampilkan kategori BMI
    void tampilKategori() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    // Menghitung kebutuhan kalori
    double hitungKalori() {
        return berat * faktorAktivitas * 10;
    }

    // Menampilkan semua informasi
    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.printf("Berat: %.1f kg%n", berat);
        System.out.printf("Tinggi: %.1f cm%n", tinggi);
        System.out.printf("BMI: %.2f%n", hitungBMI());
        tampilKategori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari%n", hitungKalori());
        System.out.println("====================================");
    }
}
