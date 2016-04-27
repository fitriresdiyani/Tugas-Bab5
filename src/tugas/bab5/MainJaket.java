package Bab5_2;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Jaket customer1 = new Jaket();
        System.out.println("          CV. Labkomdas         ");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan nama anda: ");
        customer1.nama= in.nextLine();
        System.out.println("Masukkan alamat anda: ");
        customer1.alamat= in.nextLine();
        System.out.println("Masukkan no telepon anda: ");
        customer1.notelepon= in.nextLine();
        System.out.println("-------------------------------------");
        customer1.katalogJaket();
        System.out.print("Pilihan Jaket: ");
        customer1.pilih = in.nextInt();
        System.out.println("Tentukan jumlah pesanan per ukuran");
        System.out.print("Ukuran S: ");
        customer1.s= in.nextInt();
        System.out.print("Ukuran M: ");
        customer1.m= in.nextInt();
        System.out.print("Ukuran L: ");
        customer1.l= in.nextInt();
        System.out.print("Ukuran XL: ");
        customer1.xl= in.nextInt();
        System.out.print("Ukuran XXL: ");
        customer1.xxl= in.nextInt();
        System.out.println("-------------------------------------");
        customer1.jumlah();
        customer1.pilihan(customer1.pilih, customer1.jumlah);
        System.out.println("-------------------------------------");
        customer1.tampilkanData();
        }
    }

