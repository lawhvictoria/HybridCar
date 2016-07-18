import java.util.Scanner;
/**
 *  *
 *   * @author vhlaw
 *    */
public class Lab4 {

    /**
 *      * @param args the command line arguments
 *           */
    public static void main(String[] args) {
                
        int c = 0;
        int m = 0;
        double g = 0;
        int mpg = 0;
        double r = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the new car: ");
        c = scan.nextInt();
        
        System.out.println("Enter the estimated miles driven per year: ");
        m = scan.nextInt();
        
        System.out.println("Enter the estimated gas price: ");
        g = scan.nextDouble();
        
        System.out.println("Enter the estimated in miles per gallon: ");
        mpg = scan.nextInt();
        
        System.out.println("Enter the estimated resale value after 5 years: ");
        r = scan.nextDouble();
        
        HybridCar car = new HybridCar(c, m, g, mpg, r);
        
        System.out.println("The total cost of owning the car for five years is " + ((c - r) + (m/mpg)*g));

        }                                        
}
