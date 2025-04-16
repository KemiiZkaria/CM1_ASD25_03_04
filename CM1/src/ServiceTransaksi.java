public class ServiceTransaksi {
    Transaksi[] trs=new Transaksi[5];
    
    void ServiceTransaksi(int kapasitas){

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
