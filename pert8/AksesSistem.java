public interface AksesSistem {

    // Proses masuk sistem menggunakan PIN rahasia
    void login(String pin);

    // Proses keluar dari sistem
    void logout();

    // Default method: role akses standar
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}
