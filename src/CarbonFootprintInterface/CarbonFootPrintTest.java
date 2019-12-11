package CarbonFootprintInterface;

import java.util.ArrayList;

public class CarbonFootPrintTest {
    public static void main(String[] args) {

        ArrayList<CarbonFootprint> carbonFootprintsObjects = new ArrayList<>();
        carbonFootprintsObjects.add(new Car("BMW",12,23,1999));
        carbonFootprintsObjects.add(new Bicycle("BLT","Carbon","green",123));
        carbonFootprintsObjects.add(new Building(10,13,76,14,76));

        for (CarbonFootprint currentCarbonFootPrint: carbonFootprintsObjects) {
            System.out.printf("%s\n%shis carbon footprint is %.2f\n",currentCarbonFootPrint.getClass().getName(),currentCarbonFootPrint,currentCarbonFootPrint.getCarbonFootprint());
            System.out.println();
            
        }
    }
}
