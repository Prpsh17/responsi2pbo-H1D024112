class mesinTraktor extends defaultMesin {
    double kapasitasTarik; // dalam ton

    mesinTraktor(String namaMesin, int tenagaHP, double kapasitasTarik) {
        super(namaMesin, tenagaHP);
        this.kapasitasTarik = kapasitasTarik;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin +
                           " | Tarik: " + kapasitasTarik + " ton" +
                           " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup Mesinnn!");
    }
}
