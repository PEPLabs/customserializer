import java.util.Objects;

/**
 * This is what you will be serializing / deserializing. No need to change anything in this class.
 */
public class CarModel {
    public String make;
    public String model;
    public int year;

    public CarModel(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public CarModel(){

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return year == carModel.year && Objects.equals(make, carModel.make) && Objects.equals(model, carModel.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

}
