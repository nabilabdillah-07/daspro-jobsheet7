import java.util.Scanner;
public class BayarParkir { 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jenis; 
        int durasi;
        int total = 0; 

        
        do {
            System.out.println("Parkiran");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            jenis = sc.nextInt();

            if(jenis == 1 || jenis == 2){
            System.out.print("Berapa jam parkirnya: ");
            durasi = sc.nextInt();

            if(durasi > 5) {
            total = total + 12500; 
            } else {
            if (jenis == 1) {
            total = total + (durasi * 3000);
            }
            if (jenis == 2) {
            total = total + (durasi * 2000);
        }
    }
                
            System.out.println("Total sementara: " + total);
     }
            } while (jenis != 0);
        
        System.out.println("--------------------");
        System.out.println("Total semua uang: " + total);
        
        sc.close();
    }
}