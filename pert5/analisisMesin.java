public class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] daftarMesin = new defaultMesin[5];
        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        daftarMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        daftarMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : daftarMesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : daftarMesin) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }
        System.out.println();

        defaultMesin mesinTerbaik = daftarMesin[0];
        for (int i = 1; i < daftarMesin.length; i++) {
            if (daftarMesin[i].nilaiPerforma() > mesinTerbaik.nilaiPerforma()) {
                mesinTerbaik = daftarMesin[i];
            }
        }

        System.out.println("=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(mesinTerbaik.namaMesin + " -> " + mesinTerbaik.nilaiPerforma());
        System.out.println();

        defaultMesin[] urut = daftarMesin.clone();

        for (int i = 0; i < urut.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < urut.length; j++) {
                if (urut[j].nilaiPerforma() > urut[idxMax].nilaiPerforma()) {
                    idxMax = j;
                }
            }

            defaultMesin tmp = urut[i];
            urut[i] = urut[idxMax];
            urut[idxMax] = tmp;
        }

        System.out.println("=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " +
                    urut[i].namaMesin + " -> " + urut[i].nilaiPerforma());
        }
    }
}
