class mesinTraktorListrik extends mesinTraktor {
    double kapasitasBaterai; // kWh

    mesinTraktorListrik(String namaMesin, int tenagaHP,
                        double kapasitasTarik, double kapasitasBaterai) {
        super(namaMesin, tenagaHP, kapasitasTarik);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor Listrik " + namaMesin +
                           " | Tarik: " + kapasitasTarik + " ton" +
                           " | Baterai: " + kapasitasBaterai + " kWh" +
                           " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}
