import java.util.Scanner;

public class seleksiPrakerin {
    public static void main(String[] args) {
        String nama, kelas, perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Nama : ");
        nama = s.nextLine();
        System.out.println("Masukkan kelas : (X/XI/XII)");
        kelas = s.next();

        if(kelas.equalsIgnoreCase("XII")){
            System.out.println("Perilaku Siswa: (Baik/Cukup)");
            perilaku = s.next();
            if(perilaku.equalsIgnoreCase("Baik")){
                System.out.println("Nilai siswa :");
                nilai = s.nextInt();
                if (nilai >85){
                    System.out.println(nama + " Di nyatakan bisa mengikuti prakerin ");
                }else {
                    System.out.println(" Maaf anda gagal karena nilai ");
                }
            }else {
                System.out.println(" Maaf anda gagal karena perilaku kurang baik");
            }
        }else {
            System.out.println(" Maaf anda gagal karena bukan kelas XII ");
        }


        
    }
}
