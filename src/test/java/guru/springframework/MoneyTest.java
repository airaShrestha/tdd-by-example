package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationDollar(){
        //Dollar five = new Dollar(5);
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.dollar(5), Money.franc(5));
        //assertNotEquals(Money.dollar(5), Money.dollar(5));
    }

    @Test
    void testMultiplicationFranc(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }


    @Test
    void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    void testSimpleAddition(){
        Money five= Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank ();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }
}
