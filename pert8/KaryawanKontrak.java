public interface KaryawanKontrak {

    // Menghitung total gaji bulanan berdasarkan jam kerja
    double hitungGaji(int jamKerja);

    // Mencatat perpanjangan masa kerja kontrak
    void perpanjangKontrak(int durasiBulan);

    // Default method: status cuti standar
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}
