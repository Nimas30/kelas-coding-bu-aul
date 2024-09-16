import java.util.Scanner;

public class percabanganIf {
    public static void main(String[] args) {
        
        double total;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Total : ");
        total = s.nextDouble();

        if(total > 100000){
            System.out.println("Anda mendapat diskon 10%");
        }
        
    }
    
}
