package lec7test;

import lec7.ImmutableRationalImpl;
import lec7.Rational;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lec7Tests {

    @Test
    public void testImmutableConstructor() {
        Rational r = new ImmutableRationalImpl(4, 8);
        assertEquals(1, r.getNumerator());
        assertEquals(2, r.getDenominator());

        r = new ImmutableRationalImpl(5, 7);
        assertEquals(5, r.getNumerator());
        assertEquals(7, r.getDenominator());
    }
}
