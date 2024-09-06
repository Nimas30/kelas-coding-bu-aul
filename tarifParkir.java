import java.util.Scanner;

public class tarifParkir {
    public static void main(String[] args) {
        String platNomor;
        double harga;
        int jumlahjam;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan nomor plat: ");
        platNomor = s.nextLine();
        System.out.println("Jumlah jam: ");
        jumlahjam = s.nextInt();

        if(jumlahjam >0 && jumlahjam <1){
            harga=3000;
        }else if (jumlahjam >1 && jumlahjam <4){
            harga=7000;
        }else if (jumlahjam >4){
            harga=10000;
        }else{
            harga  = 0;
            System.out.println("System Eror");
        }

        System.out.println(platNomor);
        System.out.println("Tarif parkir "+harga);



    }
}
