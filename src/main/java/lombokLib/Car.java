package lombokLib;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
@Builder
@With
public class Car {
    private String brand;
    private String model;
    private String color;
    private int power;
    private int countSeats;

//    public Car() {
//    }

//    public Car(String brand, String model, String color, int power, int countSeats) {
//        this.brand = brand;
//        this.model = model;
//        this.color = color;
//        this.power = power;
//        this.countSeats = countSeats;
//    }

//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getPower() {
//        return power;
//    }
//
//    public void setPower(int power) {
//        this.power = power;
//    }
//
//    public int getCountSeats() {
//        return countSeats;
//    }
//
//    public void setCountSeats(int countSeats) {
//        this.countSeats = countSeats;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return power == car.power && countSeats == car.countSeats && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(brand, model, color, power, countSeats);
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//               "brand='" + brand + '\'' +
//               ", model='" + model + '\'' +
//               ", color='" + color + '\'' +
//               ", power=" + power +
//               ", countSeats=" + countSeats +
//               '}';
//    }
}
