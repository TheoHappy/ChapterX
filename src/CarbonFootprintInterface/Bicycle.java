package CarbonFootprintInterface;

public class Bicycle implements CarbonFootprint {
    private String model;
    private String material;
    private String color;
    private double kmDriven;
    private final double KG_OF_CO2 = 0.016;

    public Bicycle(String model, String material, String color, double kmDriven) {
        this.model = model;
        this.material = material;
        this.color = color;
        this.kmDriven = kmDriven;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }

    public double getKG_OF_CO2() {
        return KG_OF_CO2;
    }

    @Override
    public double getCarbonFootprint() {
        return getKmDriven() * getKG_OF_CO2();
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model=" + model +
                ", material=" + material +
                ", color=" + color +
                ", kmDriven=" + kmDriven +
                ", KG_OF_CO2=" + KG_OF_CO2 +
                '}';
    }

}
