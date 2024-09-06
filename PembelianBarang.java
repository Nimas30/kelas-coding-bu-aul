import java.util.Scanner;

public class PembelianBarang {
    public static void main(String[] args) {
        double total, diskon, potonganHarga;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan total pembelian : ");
        total = input.nextDouble();

        if ( total > 150000 ) {
            potonganHarga = 0;
            diskon = 0.1;
            total -= diskon;

        } else {
            diskon = 0;
            potonganHarga = 5000;
            total -= potonganHarga;
        }

        System.out.println("Diskon : "+ diskon);
        System.out.println("Potongan harga : "+ potonganHarga);
        System.out.println("Masukkan total harga yang di bayarkan : " +total);
        
    }
    
}
