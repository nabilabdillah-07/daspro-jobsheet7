import java.util.Scanner;
public class JualTiket19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiketTotal = 0;
        double duitTotal = 0.0;
        char lanjut = 'y'; 
  
        do {
            System.out.print("Mau beli berapa tiket : ");
            int jml = sc.nextInt(); 

        
            if(jml < 0){
             System.out.println("Inputnya salah, ulang lagi !!");
                continue;
            }

            double harga = jml * 50000; 
            double diskon = 0.0;

           
            if ( jml > 10 ) {
            diskon = harga * 0.15;
            } else if ( jml > 4 ) {
            diskon = harga * 0.1; 
            }

            double bayar = harga - diskon;

            System.out.println("Total bayarnya : " + bayar);
            
            
            tiketTotal = tiketTotal + jml;
            duitTotal = duitTotal + bayar;

            System.out.print("Mau input lagi? (y/n): ");
            lanjut = sc.next().charAt(0);
            
        } while ( lanjut == 'y' || lanjut == 'Y');

        System.out.println("Penjualan hari ini");
        System.out.println("Total tiket : " + tiketTotal);
        System.out.println("Total duit : " + duitTotal);

        sc.close();
    }
}