package datum;

import java.time.Instant;
import java.util.List;

public record Order(
        String id,
        List<String> products,
        Instant orderedAt
) {
}
