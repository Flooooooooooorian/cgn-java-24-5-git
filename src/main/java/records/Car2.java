package records;

import java.math.BigDecimal;
import java.util.Objects;

public class Car2 {
    private String brand;
    private String model;
    private String color;
    private int countDoors;
    private BigDecimal price;

    public Car2() {
    }

    public Car2(String brand, String model, String color, int countDoors, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.countDoors = countDoors;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car2 car = (Car2) o;
        return countDoors == car.countDoors && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, countDoors, price);
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", countDoors=" + countDoors +
               ", price=" + price +
               '}';
    }
}
