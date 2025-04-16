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
        System.out.println("Kode Transaksi : "+kodeTransaksi);
        System.out.println("saldo: "+saldo);
        System.out.println("inOutSaldo: "+inOutSaldo);
        System.out.println("Final saldo: "+finalSaldo);
        System.out.println("Tanggal Transaksi: "+tanggalTransaksi);
        System.out.println("Type: "+type);
    }
}
