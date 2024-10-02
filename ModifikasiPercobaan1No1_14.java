import java.util.Scanner;
public class ModifikasiPercobaan1No1_14 {

    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = input14.nextInt();

        if ((tahun % 4) == 0) 
             if ((tahun % 100 != 0) || tahun % 400 == 0) {
                   System.out.println("Tahun Kabisat");
               } else {
                   System.out.println("Bukan tahun kabisat");  
       
                 input14.close();
               }
            }
    }
