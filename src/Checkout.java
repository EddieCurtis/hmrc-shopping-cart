import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by eddie on 2/8/17.
 */
public class Checkout {

    public static BigDecimal total(Collection<Item> items) {

        BigDecimal total = BigDecimal.ZERO;

        // Group by item identity and store the count of each item.
        Map<Item, Long> groupedMap = items.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Multiply the count of each item by its cost.
        for (Map.Entry<Item, Long> entry : groupedMap.entrySet()) {
            BigDecimal totalForItem = BigDecimal.valueOf(entry.getValue()).multiply(entry.getKey().cost);
            total = total.add(totalForItem);
        }

        return total;
    }

}
