public class Bank {

    String noRekening, nama, namaIbu, noHp, email;
    Bank(String norek, String nm, String nmIbu, String no, String eml){
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }
    void tampiDataNorek(){
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Nama       : " + nama);
        System.out.println("Nama Ibu   : " + namaIbu);
        System.out.println("No HP      : " + noHp);
        System.out.println("Email      : " + email);
    }
}