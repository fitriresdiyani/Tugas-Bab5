package Bab5_2;
public class Jaket{
    public String nama;
    public String alamat;
    public String notelepon;
    public final int a = 100000;
    public final int b = 125000;
    public final int c = 175000;
    public int bayar;
    public int jumlah;
    public int pilih;
    public int s,m,l,xl,xxl;
    public String jaket;
    public int potongan;
    public void jumlah(){
        this.jumlah = s+m+l+xl+xxl;
    }
    public void katalogJaket() {
        System.out.println("Katalog Jaket");
        System.out.println("1. Jaket Bahan A - Rp. 100.000");
        System.out.println("2. Jaket Bahan B - Rp. 125.000");
        System.out.println("3. Jaket Bahan C - Rp. 175.000");
        System.out.println("**Pemesanan lebih dari 100 akan mendapatkan potongan harga**");
    }
    public void pilihan(int pilih, int jumlah) {
        if (jumlah > 100) {
            System.out.println("Anda mendapatkan potongan harga");
            if (pilih == 1) {
                this.jaket = "Jaket Bahan A";
                this.potongan = 5000;
                this.bayar = (a - potongan) *jumlah;
            } else if (pilih == 2) {
                this.jaket = "Jaket Bahan B";
                this.potongan = 5000;
                this.bayar = (b - potongan) *jumlah;
            } else if (pilih == 3) {
                this.jaket = "Jaket Bahan C";
                this.potongan = 15000;
                this.bayar = (c - potongan) * jumlah;
            } 
        }
        else {
            System.out.println("Anda tidak mendapatkan potongan harga");
        if (pilih == 1) {
            this.jaket = "Jaket Bahan A";
            this.potongan = 0;
            this.bayar = a*jumlah;
        } else if (pilih == 2) {
            this.jaket = "Jaket Bahan B";
            this.potongan = 0;
            this.bayar = b * jumlah;
        } else if (pilih == 3) {
            this.jaket = "Jaket Bahan C";
            this.potongan = 0;
            this.bayar = c * jumlah;
        }
        }
    }
    public void tampilkanData() {
        System.out.println("Data Customer");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("No Telepon\t: " + notelepon);
        System.out.println("Pilihan Jaket\t: " +jaket);
        System.out.println("Total Pesanan\t: "+jumlah);
        System.out.println("Harga Satuan\t: Rp " +a);
        System.out.println("Potongan Harga\t: " +potongan);
        System.out.println("--------------------------------");
        System.out.println("Total Bayar\t: Rp "+ bayar);
        System.out.println("--------------------------------");
    }
}
