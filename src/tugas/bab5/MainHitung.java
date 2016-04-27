package Bab5_1;
import java.util.Scanner;
public class MainHitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan,nil1,nil2;
        do {
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan Pecahan");
            System.out.println("6. Keluar");
            System.out.println("---------------------------");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = in.nextInt();
            System.out.println("");
            switch (pilihan) {
                case 1:
                    System.out.println("1.Penjumlahan");
                    System.out.print("Masukkan nilai 1 : ");
                    nil1 = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    nil2 = in.nextInt();
                    Hitung.penjumlahan(nil1,nil2);
                    System.out.println("---------------------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("2.Pengurangan");
                    System.out.print("Masukkan nilai 1 : ");
                    nil1 = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    nil2 = in.nextInt();
                    Hitung.pengurangan(nil1,nil2);
                    System.out.println("---------------------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("3.Perkalian");
                    System.out.print("Masukkan nilai 1 : ");
                    nil1 = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    nil2 = in.nextInt();
                    Hitung kali = new Hitung();
                    kali.perkalian(nil1,nil2);
                    System.out.println("---------------------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("4.Pembagian");
                    System.out.print("Masukkan nilai 1 : ");
                    nil1 = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    nil2 = in.nextInt();
                    Hitung bagi = new Hitung();
                    bagi.pembagian(nil1,nil2);
                    System.out.println("---------------------------");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("5.Penyederhanaan Pecahan");
                    System.out.print("Masukkan nilai 1 : ");
                    nil1 = in.nextInt();
                    System.out.print("Masukkan nilai 2 : ");
                    nil2 = in.nextInt();
                    Hitung sederhana = new Hitung();
                    sederhana.penyederhanaan(nil1,nil2);
                    System.out.println("---------------------------");
                    System.out.println("");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    System.out.println("");
            }
        } while (pilihan != 6);
    }
}
