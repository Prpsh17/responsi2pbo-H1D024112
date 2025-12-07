public class PaymentTest {
    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment ovo = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("Saldo awal: " + ovo.getBalance());

        ovo.processPayment();

        System.out.println("Sisa saldo: " + ovo.getBalance());
        System.out.println("Detail Transaksi: " + ovo.getPaymentDetails());
    }
}
