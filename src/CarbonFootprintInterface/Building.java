package CarbonFootprintInterface;

public class Building implements CarbonFootprint {
    private double electricityUsed;
    private double gasUsed;
    private double coalUsed;
    private double propaneUsed;
    private double woodenPelletsUsed;
    private final double ELECTRICITY_KG_OF_CO2 = 0.51;
    private final double WOOD_KG_OF_CO2 = 0.39;
    private final double COAL_KG_OF_CO2 = 0.34;
    private final double GAS_KG_OF_CO2 = 0.25;
    private final double PROPANE_KG_OF_CO2 = 0.24;

    public Building(double electricityUsed, double gasUsed, double coalUsed, double propaneUsed, double woodenPelletsUsed) {
        this.electricityUsed = electricityUsed;
        this.gasUsed = gasUsed;
        this.coalUsed = coalUsed;
        this.propaneUsed = propaneUsed;
        this.woodenPelletsUsed = woodenPelletsUsed;
    }

    public double getElectricityUsed() {
        return electricityUsed;
    }

    public void setElectricityUsed(double electricityUsed) {
        this.electricityUsed = electricityUsed;
    }

    public double getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(double gasUsed) {
        this.gasUsed = gasUsed;
    }

    public double getCoalUsed() {
        return coalUsed;
    }

    public void setCoalUsed(double coalUsed) {
        this.coalUsed = coalUsed;
    }

    public double getPropaneUsed() {
        return propaneUsed;
    }

    public void setPropaneUsed(double propaneUsed) {
        this.propaneUsed = propaneUsed;
    }

    public double getWoodenPelletsUsed() {
        return woodenPelletsUsed;
    }

    public void setWoodenPelletsUsed(double woodenPelletsUsed) {
        this.woodenPelletsUsed = woodenPelletsUsed;
    }

    public double getELECTRICITY_KG_OF_CO2() {
        return ELECTRICITY_KG_OF_CO2;
    }

    public double getWOOD_KG_OF_CO2() {
        return WOOD_KG_OF_CO2;
    }

    public double getCOAL_KG_OF_CO2() {
        return COAL_KG_OF_CO2;
    }

    public double getGAS_KG_OF_CO2() {
        return GAS_KG_OF_CO2;
    }

    public double getPROPANE_KG_OF_CO2() {
        return PROPANE_KG_OF_CO2;
    }

    @Override
    public double getCarbonFootprint() {
        return getElectricityUsed() * getELECTRICITY_KG_OF_CO2()
                + getCoalUsed() * getCOAL_KG_OF_CO2()
                + getGasUsed() * getGAS_KG_OF_CO2()
                + getWoodenPelletsUsed() * getWOOD_KG_OF_CO2()
                + getPropaneUsed() * getPROPANE_KG_OF_CO2();
    }

    @Override
    public String toString() {
        return String.format("Building{%.2f kWh of electricity at %.2f kgCO2e/kWh\n" +
                        "%.2f kWh of natural gas at %.2f kgCO2e/kWh\n" +
                        "%.2f kWh of coal at %.2f kgCO2e/kWh\n" +
                        "%.2f kWh of propane at %.2f kgCO2e/kWh\n" +
                        "%.2f kWh of wooden pallets at %.2f kgCO2e/kWh}\n",
                getElectricityUsed(), getELECTRICITY_KG_OF_CO2(),
                getGasUsed(), getGAS_KG_OF_CO2(),
                getCoalUsed(), getCOAL_KG_OF_CO2(),
                getPropaneUsed(), getPROPANE_KG_OF_CO2(),
                getWoodenPelletsUsed(), getWOOD_KG_OF_CO2());
    }
}
