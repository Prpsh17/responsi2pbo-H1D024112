public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {

    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    // Constructor
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;  // default
    }

    // ==============================
    // Implementasi KaryawanKontrak
    // ==============================
    @Override
    public double hitungGaji(int jamKerja) {
        double total = jamKerja * gajiPerJam;
        System.out.println("Gaji " + nama + " untuk " + jamKerja +
                           " jam kerja adalah: Rp " + total);
        return total;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak " + nama +
                           " diperpanjang selama " + durasiBulan + " bulan.");
    }

    // Override default: status cuti khusus magang
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    // =========================
    // Implementasi AksesSistem
    // =========================
    @Override
    public void login(String pin) {
        if (pinRahasia.equals(pin)) {
            if (!sedangLogin) {
                sedangLogin = true;
                System.out.println("Login berhasil. Selamat datang, " + nama + ".");
            } else {
                System.out.println("Sudah dalam keadaan login.");
            }
        } else {
            System.out.println("Login gagal! PIN salah.");
        }
    }

    @Override
    public void logout() {
        if (sedangLogin) {
            sedangLogin = false;
            System.out.println("Logout berhasil. Sampai jumpa, " + nama + ".");
        } else {
            System.out.println("Tidak bisa logout, " + nama + " belum login.");
        }
    }

    // Override default: role akses khusus magang IT
    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}
