class Customer {
    String nama;
    String id;
    int totalBelanja;

    // Constructor parent
    Customer(String nama, String id, int totalBelanja) {
        this.nama = nama;
        this.id = id;
        this.totalBelanja = totalBelanja;
    }

    // Menampilkan informasi dasar customer
    void tampilkanInfo() {
        System.out.println("Nama: " + nama +
                           " | ID: " + id +
                           " | Total Belanja: Rp " + totalBelanja);
    }
}
