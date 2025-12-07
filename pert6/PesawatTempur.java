class PesawatTempur extends KendaraanGalaksi {

    int jumlahRudal;

    PesawatTempur(String nama, int kapasitasPenumpang, int jumlahRudal) {
        super(nama, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    void aktifkanMesin() {
        if (energi < 20) {
            System.out.println("Energi tidak mencukupi untuk mengaktifkan mesin pesawat tempur.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int kilometer) {
        int konsumsi = kilometer * 3; // 3% per km
        if (energi >= konsumsi) {
            energi -= konsumsi;
            System.out.println("Pesawat tempur menjelajah sejauh " + kilometer + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " 
                               + kilometer + " km.");
        }
    }

    @Override
    void isiEnergi(int persen) {
        energi += persen;
        if (energi > 100) {
            energi = 100;
        }
    }

    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak mencukupi untuk ditembakkan.");
        }
    }
}
