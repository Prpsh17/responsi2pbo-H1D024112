public class UjiKaryawan {
    public static void main(String[] args) {

        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // 1. Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        Karyawan k1 = new Karyawan("Budi Santoso", 4000000.0);
        k1.tampilInfo();

        System.out.println();

        // 2. Manajer
        System.out.println("Status: Manajer");
        Manajer m1 = new Manajer("Siti Aminah", 6000000.0, 2500000.0);
        m1.tampilInfo();
    }
}
