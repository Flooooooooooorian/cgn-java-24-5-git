package lombokLib;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Car2(
        String brand,
        String model,
        String color,
        int power,
        int countSeats,
        int countDoors
) {

}
