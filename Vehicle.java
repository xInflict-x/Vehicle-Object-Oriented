public class Vehicle implements VehicleInterface {
    private String color = "color";
    private int mph = 0;
    private String tireSize = "tireSize";
    private int cost = 0;
    private String vehicleSize = "vehicleSize";
    private int weight = 0;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTireSize() {
        return this.tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

    public int getMph() {
        return this.mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getVehicleSize() {
        return this.vehicleSize;
    }

    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
