public interface PaymentMethod {

    void processPayment();        // memproses transaksi pembayaran
    String getPaymentDetails();   // detail transaksi (nama e-wallet)
    double getTransactionFee();   // biaya transaksi, misal 2000
    double getBalance();          // mengembalikan saldo pengguna
}
