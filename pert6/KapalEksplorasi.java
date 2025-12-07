class KapalEksplorasi extends KendaraanGalaksi {

    int modulScanLevel;

    KapalEksplorasi(String nama, int kapasitasPenumpang, int modulScanLevel) {
        super(nama, kapasitasPenumpang);
        this.modulScanLevel = modulScanLevel;
    }

    @Override
    void aktifkanMesin() {
        if (energi < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai misi eksplorasi.");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int kilometer) {
        int konsumsi = kilometer * 2; // 2% per km
        if (energi >= konsumsi) {
            energi -= konsumsi;
            System.out.println("Kapal eksplorasi menjelajah sejauh " 
                               + kilometer + " km.");
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

    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet 
                           + " dengan modul level " + modulScanLevel + ".");
    }
}
