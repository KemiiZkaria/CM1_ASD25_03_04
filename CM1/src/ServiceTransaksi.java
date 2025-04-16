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
        for (int i = 0; i < arrBank.length; i++) {
            arrBank[i].tampiDataNorek();
        }
    }
    void TampilTransaksi(Transaksi[] arrTransaksi){
        for (int i = 0; i < arrTransaksi.length; i++) {
            System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s %-15s", "Kode transaksaksi","No Rekening","Soldo","Debit/Kredit","Final Saldo","Tanggal Transaksi","Type");
    }
    void Searching(String key){
        for (int i = 0; i < trs.length; i++) {
            if(key==trs[i].kodeTransaksi){
                trs[i].tampilDataTransaksi();
            }
        }
    }
    void minFinalsaldo(){
        Transaksi min=trs[0];
        for (int i = 1; i < trs.length; i++) {
            if (trs[i].finalSaldo < min.finalSaldo) {
                min=trs[i];
            }
        }
        min.tampilDataTransaksi();
    }
    void sorting(Bank[] arrBank){
        for (int i = 0; i < trs.length-1; i++) {
            for (int j = 1; j < trs.length-i; j++){
                if (arrBank[j].noRekening.compareToIgnoreCase(arrBank[j-1].noRekening)>0){
                    Bank temp=arrBank[j];
                    arrBank[j]=arrBank[j-1];
                    arrBank[j-1]=temp;
                }
            }
        }
    }
}
