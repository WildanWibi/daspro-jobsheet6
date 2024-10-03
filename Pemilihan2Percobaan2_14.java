import java.util.Scanner;
public class Pemilihan2Percobaan2_14 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        int menu;
        String member;
        double harga = 0, total_bayar, diskon = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        menu = input14.nextInt();
        input14.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input14.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
 
            }else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (menu == 3) {
                harga = 15000;
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            System.out.println("-------------------------------------");}

            else if (member.equalsIgnoreCase("n")) {
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);

                }else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                    
                }else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                     
                }else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return; 
                }   
                System.out.println("Total bayar = " + harga);
               
            }else {
                System.out.println("Membaer tidak valid");
        }
       
    }
}
