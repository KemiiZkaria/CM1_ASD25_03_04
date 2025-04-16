public class Transaksi {
    String kodeTransaksi;
    double saldo;
    double inOutSaldo;
    double finalSaldo;
    String tanggalTransaksi;
    String type;
    Bank bankAcc;

    Transaksi(){}

    Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type, Bank bankAcc) {
        this.kodeTransaksi = kodeTransaksi;
        this.saldo=saldo;
        this.inOutSaldo=inOutSaldo;
        this.finalSaldo=finalSaldo;
        this.tanggalTransaksi=tanggalTransaksi;
        this.type=type;
        this.bankAcc=bankAcc;
    }
    void tampilDataTransaksi(){
        System.out.printf("%-25s %-20s %-15.2f %-15.2f %-15.2f %-15s %-15s\n",
        kodeTransaksi,
        bankAcc.noRekening,
        saldo,
        inOutSaldo,
        finalSaldo,
        tanggalTransaksi,
        type
    );
    }
}
