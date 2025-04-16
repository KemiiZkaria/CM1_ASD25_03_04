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
    void sorting(){
        for (int i = 0; i < trs.length-1; i++) {
            for (int j = 1; j < trs.length-i; j++){
                if (trs[j].noRekening < trs[j-1].noRekening){
                    Transaksi temp=trs[j];
                    trs[j]=trs[j-1];
                    trs[j-1]=temp;
                }
            }
    }
}
