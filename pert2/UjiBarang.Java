public class UjiBarang {
    public static void main(String[] args) {

        // Barang pertama: Gitar Akustik
        // Awalnya hanya kode dan nama yang diketahui
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga dan tambah stok
        gitar.ubahHarga(1500000.0);
        gitar.tambahStok(5);

        // Barang kedua: Drum Set (data lengkap sejak awal)
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);

        // Tampilkan hasil
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}
