import java.math.BigDecimal;

/**
 * Created by eddie on 2/8/17.
 */
public enum Item {
    APPLE(new BigDecimal("0.6")),
    ORANGE(new BigDecimal("0.25"));

    public final BigDecimal cost;

    Item(BigDecimal cost) {
        this.cost = cost;
    }


}
