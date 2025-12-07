class mesinMotor extends defaultMesin {
    String tipeMotor;

    mesinMotor(String namaMesin, int tenagaHP, String tipeMotor) {
        super(namaMesin, tenagaHP);
        this.tipeMotor = tipeMotor;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Motor " + namaMesin +
                           " | Tipe: " + tipeMotor +
                           " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        return "Mesin Motor";
    }

    void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}
