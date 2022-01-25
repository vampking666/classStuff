package carrentalservice;

public class Car {
    private String make;
    private String model;
    private boolean isRented;
    private boolean isAvail;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.isRented = false;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isIsRented() {
        return this.isRented;
    }

    public boolean setIsRented() {
        return this.isRented;
    }

    public boolean isIsAvail() {
        return this.isAvail;
    }

    public boolean setIsAvail() {
        return this.isAvail;
    }

    @Override
    public String toString() {
        return "{" +
            " make = '" + getMake() + "'" +
            ", model = '" + getModel() + "'" +
            ", isRented = '" + isIsRented() + "'" +
            ", isAvail = '" + isIsAvail() + "'" +
            "}";
    }

}
