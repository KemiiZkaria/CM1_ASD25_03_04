public class ServiceTransaksi {
    Transaksi[] trs;
    int idx=0;
    void ServiceTransaksi(int kapasitas){
        trs = new Transaksi[kapasitas];
        idx=0;
    }
    void tambah(Transaksi t){
        trs[idx++]=t;
    }
    void TampilData(Bank[] arrBank){
        System.out.printf("%-16s %-10s %-10s %-18s %-25s%n", "No Rekening", "Nama", "Nama Ibu", "No HP", "Email");
        for (Bank bank : arrBank) {
            System.out.printf("%-16s %-10s %-10s %-18s %-25s%n",
                bank.noRekening, bank.nama, bank.namaIbu, bank.noHp, bank.email);
        }
    }
    void TampilTransaksi(Transaksi[] arrTransaksi){
        System.out.printf("%-20s %-18s %-15s %-15s %-15s %-15s %-20s\n", "Kode transaksi","No Rekening","Saldo","Debit/Kredit","Final Saldo","Tanggal Transaksi","Type");
        for (int i = 0; i < arrTransaksi.length; i++) {
            arrTransaksi[i].tampilDataTransaksi();;
        }
    }
    void Searching(String key){
        for (int i = 0; i < trs.length; i++) {
            if(key.equalsIgnoreCase(trs[i].kodeTransaksi)){
                
                trs[i].tampiltransaksi();
                return;
            }
        }
        System.out.println("Data tidak ditemukan");
    }

    void minFinalsaldo(){
        Transaksi min=trs[0];
        for (int i = 1; i < trs.length; i++) {
            if (trs[i].finalSaldo < min.finalSaldo) {
                min=trs[i];
            }
        }
        min.tampiltransaksi();
    }
    void sorting(Bank[] arrBank){
        for (int i = 0; i < trs.length-1; i++) {
            for (int j = 1; j < trs.length-i; j++){
                if (arrBank[j].noRekening.compareToIgnoreCase(arrBank[j-1].noRekening)<0){
                    Bank temp=arrBank[j];
                    arrBank[j]=arrBank[j-1];
                    arrBank[j-1]=temp;
                }
            }
        }
        TampilData(arrBank);
    }
}
