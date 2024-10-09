package records;

import java.math.BigDecimal;

public record Car(
        String brand,
        String model,
        String color,
        int countDoors,
        BigDecimal price,
        String sound
) {

}
