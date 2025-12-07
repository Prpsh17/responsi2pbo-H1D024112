abstract class KendaraanGalaksi {
    String nama;
    int energi;                // dalam persen (0–100)
    int kapasitasPenumpang;

    KendaraanGalaksi(String nama, int kapasitasPenumpang) {
        this.nama = nama;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.energi = 100;     // default: penuh 100%
    }

    void tampilStatus() {
        System.out.println(nama + " | Energi: " + energi + "% | Kapasitas: " 
                           + kapasitasPenumpang + " orang");
    }

    // Method abstrak → wajib dioverride di subclass
    abstract void aktifkanMesin();
    abstract void jelajah(int kilometer);
    abstract void isiEnergi(int persen);
}
