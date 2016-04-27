package Bab5_1;
public class Hitung {   
    public static void penjumlahan(int nilai1, int nilai2) {
        int penjumlahan = nilai1 + nilai2;
        System.out.println("Hasil penjumlahan = " + penjumlahan);
    }
    public static void pengurangan(int nilai1, int nilai2) {
        int pengurangan = nilai1 - nilai2;
        System.out.println("Hasil pengurangan = " + pengurangan);
    }
    public void perkalian(int nilai1, int nilai2 ) {
        int perkalian = nilai1 * nilai2;
        System.out.println("Hasil perkalian = " + perkalian);
    }
    public void pembagian(int nilai1, int nilai2) {
        int pembagian = nilai1 / nilai2;
        System.out.println("Hasil pembagian = " + pembagian);
    }
    public void penyederhanaan(int pembilang, int penyebut){
        int temp, A, B;
        if ( penyebut == 0){
            return;
        }   
        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;
        while (B != 0){
            temp= A % B;
            A = B;
            B = temp;
        }
        pembilang /=A;
        penyebut /=A;
        System.out.println("Hasil penyederhanaan = "+ pembilang + "/"+penyebut);
    }
}
