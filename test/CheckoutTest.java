import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by eddie on 2/8/17.
 */
public class CheckoutTest {

    @Test
    public void testApple() throws Exception {
        List<Item> items = Arrays.asList(Item.APPLE);
        assertEquals(new BigDecimal("0.6"), Checkout.total(items));
    }

    @Test
    public void testApples() throws Exception {
        List<Item> items = Arrays.asList(Item.APPLE, Item.APPLE, Item.APPLE);
        assertEquals(new BigDecimal("1.8"), Checkout.total(items));
    }

    @Test
    public void testOrange() throws Exception {
        List<Item> items = Arrays.asList(Item.ORANGE);
        assertEquals(new BigDecimal("0.25"), Checkout.total(items));
    }

    @Test
    public void testOranges() throws Exception {
        List<Item> items = Arrays.asList(Item.ORANGE, Item.ORANGE, Item.ORANGE);
        assertEquals(new BigDecimal("0.75"), Checkout.total(items));
    }

    @Test
    public void testApplesAndOranges() throws Exception {
        List<Item> items = Arrays.asList(Item.ORANGE, Item.APPLE, Item.ORANGE, Item.APPLE, Item.ORANGE, Item.APPLE);
        assertEquals(new BigDecimal("2.55"), Checkout.total(items));
    }
}
