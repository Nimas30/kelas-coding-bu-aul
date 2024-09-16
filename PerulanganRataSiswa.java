import java.util.Scanner;

public class PerulanganRataSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, jumlahSiswa;
        double totalNilai, rataRata=0;
        System.out.println("Masukkan jumlah siswa: ");
        Scanner s = new Scanner(System.in);
        jumlahSiswa=s.nextInt();

        int total = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa " + i );
            nilai = input.nextInt();
            total += nilai;
        }

        rataRata =  total / jumlahSiswa;

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
        
       
    }
}
  
 
    

