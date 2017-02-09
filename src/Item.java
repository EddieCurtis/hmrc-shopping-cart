import java.math.BigDecimal;

/**
 * Created by eddie on 2/8/17.
 */
public enum Item {
    APPLE(new BigDecimal("0.6"), 2),
    ORANGE(new BigDecimal("0.25"), 3);

    public final BigDecimal cost;
    public final int freeDivisor;

    /**
     * @param cost - The cost of one item.
     * @param freeDivisor - Indicates the divisor used to calculate the number of free Items.
     */
    Item(BigDecimal cost, int freeDivisor) {
        this.cost = cost;
        this.freeDivisor = freeDivisor;
    }


}
