import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        int pilihanMenu, jumlahBeli;
        double harga, totalHarga = 0;

        Scanner s = new Scanner(System.in);
        System.out.println(" == List Menu == ");
        System.out.println(" 1.Seblak Bandung <3 \n2.Bakso aci unyil <3 \n3.Mie ayam <33");
        System.out.println(" Masukkan pilihan menu : ( 1/2/3) ");
        pilihanMenu = s.nextInt();

        switch (pilihanMenu) {
            case 1:
                harga = 17000;
                break;
            case 2:
                harga = 15000;
                break;
            case 3:
                harga = 10000;
                break;
            default:
                harga = 0;
                System.out.println(" Error↺ ");

        }

        System.out.println(" Jumlah yang di beli ");
        jumlahBeli = s.nextInt();
        totalHarga = harga * jumlahBeli;
        System.out.println(" Total yang harus dibayarkan " + totalHarga);

    }

}
