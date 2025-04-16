import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] arrBank = new Bank[5]; 
        arrBank[0] = new Bank("1634823 3084", "Wallace", "Mei Mei", "0829-3452-8477", "wallace@gmail.com");
        arrBank[1] = new Bank("1624638 4364", "Darius", "Susanti", "0823-4435-4427", "darius@gmail.com");
        arrBank[2] = new Bank("1633425 5234", "Fuller", "Rosalia", "0837-7463-7283", "fuller@gmail.com");
        arrBank[3] = new Bank("1634432 3077", "Maria", "Krabela", "0829-3452-8627", "maria@gmail.com");
        arrBank[4] = new Bank("1625634 1344", "Gery", "Fatimah", "0859-3123-7727", "gery@gmail.com");

        Transaksi[] arrTransaksi = new Transaksi[5];
        arrTransaksi[0] = new Transaksi(null, 0, 0, 0, null, null);


        while (true) {
            System.out.println("===== POLINEMA BANK =====");
            System.out.println("Bank Menu: ");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search Data");
            System.out.println("4. Display min/max Saldo");
            System.out.println("5. Sort Data");
            System.out.println("6. Exit");

            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Program dihentikan");
                    return;
                default:
                    break;
            }
        }
    }
}