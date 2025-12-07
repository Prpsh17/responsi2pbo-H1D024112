public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");
        System.out.println();

        // 1. Pesawat Tempur – Astra-Fury
        System.out.println("--- PESAWAT TEMPUR ---");
        PesawatTempur pesawat = new PesawatTempur("Astra-Fury", 2, 8);

        pesawat.aktifkanMesin();
        pesawat.jelajah(10);      // 10 km → energi -30 → 70
        pesawat.jelajah(30);      // butuh 90, energi 70 → tidak cukup
        pesawat.tembakRudal(3);
        pesawat.tampilStatus();

        System.out.println();

        // 2. Kapal Eksplorasi – Voyager X
        System.out.println("--- KAPAL EKSPLORASI ---");
        KapalEksplorasi kapal = new KapalEksplorasi("Voyager X", 10, 4);

        kapal.aktifkanMesin();
        kapal.jelajah(15);        // 15 km → energi -30 → 70
        kapal.scanPlanet("Kepler-442b");
        kapal.tampilStatus();
    }
}
