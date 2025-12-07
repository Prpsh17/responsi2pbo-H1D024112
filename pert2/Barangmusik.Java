class BarangMusik {
    // Tuliskan state (variabel) yang diperlukan di sini
    String kode;
    String nama;
    double harga;
    int stok;

    // Cara pertama: hanya kode dan nama
    BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Cara kedua: kode, nama, dan harga
    BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Cara ketiga: kode, nama, harga, dan stok
    BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Mengubah harga barang
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Menambah stok
    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    // Menampilkan informasi lengkap
    void tampilInfo() {
        System.out.println(
            "Alat musik " + nama +
            " | Kode: " + kode +
            " | Harga: Rp " + harga +
            " | Stok: " + stok + " unit"
        );
    }
}
