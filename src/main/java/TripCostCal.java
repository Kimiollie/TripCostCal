import java.util.Scanner;

public class TripCostCal {
    private static final double FUEL_CONSUMPTION_RATE = 5.0 / 100.0;

    public double calculateTotalCost(double distance, double fuelPrice) {
        double totalFuelNeeded = distance * FUEL_CONSUMPTION_RATE;
        return totalFuelNeeded * fuelPrice;
    }

    public static void main(String[] args) {
        TripCostCal tripCostCal = new TripCostCal();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Trip Cost Calculator =====");
            System.out.println("1. Calculate Trip Cost");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the distance to travel (in kilometers): ");
                    double distance = scanner.nextDouble();
                    System.out.print("Enter the fuel price per liter: ");
                    double fuelPrice = scanner.nextDouble();
                    double totalCost = tripCostCal.calculateTotalCost(distance, fuelPrice);
                    System.out.printf("The total cost of the trip is: %.2f\n", totalCost);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
