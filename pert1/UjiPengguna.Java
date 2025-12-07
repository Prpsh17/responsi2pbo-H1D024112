class UjiPengguna {
    public static void main(String[] args) {

        // Membuat objek pengguna
        Pengguna p = new Pengguna(25, 60.0, 170.0);

        // Memanggil method tampilInfo()
        p.tampilInfo();

        // Demonstrasi bahwa faktorAktivitas adalah final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");

        System.out.println("\nJika kita mencoba menulis:");
        System.out.println("p.faktorAktivitas = 1.5;");
        System.out.println("\nMaka akan muncul error:");
        System.out.println("'cannot assign a value to final variable faktorAktivitas'");

        // Jika baris ini dibuka, program TIDAK AKAN bisa dicompile:
        // p.faktorAktivitas = 1.5;  // ERROR!
    }
}
