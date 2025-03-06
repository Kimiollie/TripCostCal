import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripCostCalTest {

    @Test
    public void testCalculateTotalCost() {
        TripCostCal tripCostCal = new TripCostCal();
        double distance = 200.0;
        double fuelPrice = 1.5;
        double expectedCost = 15.0;
        double actualCost = tripCostCal.calculateTotalCost(distance, fuelPrice);
        assertEquals(expectedCost, actualCost, 0.01);
    }
}