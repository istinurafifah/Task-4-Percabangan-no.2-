import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        double nilai = input.nextDouble();
        System.out.println("Nilai anda =" + nilai);
         if (nilai < 75) {
            System.out.println("Dinyatakan Tidak lulus");

         } else if (nilai >= 75) {
            System.out.println("Dinyatakan lulus");
         }{

         input.close();

            
         } 
        }
    }

