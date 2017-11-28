public class Car {

    String color;
    String horsePower;
    String engineSize;
    String make;

    public Car(String color, String horsePower, String engineSize, String make) {
        this.color = color;
        this.horsePower = horsePower;
        this.engineSize = engineSize;
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public String getMake() {
        return make;
    }

    public String toString(){
        return getMake();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

}
