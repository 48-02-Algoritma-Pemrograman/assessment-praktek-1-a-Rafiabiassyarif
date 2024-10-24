import java.util.Scanner;

    public class HitungHonorLembur {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int totalJamLembur = 0;  
            double honorLembur = 10.000, tambahanLembur = 0, SisaJamLembur = 15000;

            System.out.print("totalJamLembur: ");
            totalJamLembur = scanner.nextInt();
            
            if ( totalJamLembur == 16) {
                tambahanLembur = 10000+totalJamLembur;
            } else if ( totalJamLembur > 16 ) {
                tambahanLembur= 10000+totalJamLembur;
            } else if (SisaJamLembur == 0) {
                tambahanLembur = 15000+totalJamLembur;
            }
            
            honorLembur += tambahanLembur;
            System.out.println("Honor Lembur: " + honorLembur);
            
            scanner.close();
     }
   }
