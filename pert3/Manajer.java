class Manajer extends Karyawan {
    double tunjangan;

    // Constructor child, gunakan super untuk panggil constructor parent
    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Override method tampilInfo()
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama +
                           " | Gaji Pokok: Rp " + gajiPokok +
                           " | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}
