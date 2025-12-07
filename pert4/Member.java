class Member extends Customer {

    int poin;
    String level;

    // Constructor child --> gunakan super untuk memanggil parent
    Member(String nama, String id, int totalBelanja, int poin, String level) {
        super(nama, id, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    // Overriding tampilkanInfo
    @Override
    void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dari Customer dulu

        System.out.println("Poin Reward: " + poin +
                           " | Level: " + level);
    }
}
