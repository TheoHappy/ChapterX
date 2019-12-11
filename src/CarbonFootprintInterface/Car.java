package CarbonFootprintInterface;

public class Car implements CarbonFootprint {

    private String model;
    private double litresOfFuel;
    private double kilogramsOfCO2; // kilograms of CO2 per litre
    private int year;

    public Car(String model, double litresOfFuel, double kilogramsOfCO2, int year) {
        this.model = model;
        this.litresOfFuel = litresOfFuel;
        this.kilogramsOfCO2 = kilogramsOfCO2;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLitresOfFuel() {
        return litresOfFuel;
    }

    public void setLitresOfFuel(double litresOfFuel) {
        this.litresOfFuel = litresOfFuel;
    }

    public double getKilogramsOfCO2() {
        return kilogramsOfCO2;
    }

    public void setKilogramsOfCO2(double kilogramsOfCO2) {
        this.kilogramsOfCO2 = kilogramsOfCO2;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public double getCarbonFootprint() {
        return getLitresOfFuel() * getKilogramsOfCO2();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", litresOfFuel=" + litresOfFuel +
                ", kilogramsOfCO2=" + kilogramsOfCO2 +
                ", year=" + year +
                '}';
    }
}
