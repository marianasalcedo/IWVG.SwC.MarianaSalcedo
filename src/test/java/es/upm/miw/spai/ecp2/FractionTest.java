package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	Fraction fraction;
	
	@Before
	public void before() {
		fraction = new Fraction(4,8);
	}
	
	@Test
	public void testFractionIntInt() {
		assertEquals(4, this.fraction.getNumerator());
		assertEquals(8, this.fraction.getDenominator());
	}

	@Test
	public void testFraction() {
		Fraction fraction2 = new Fraction();
		assertEquals(1, fraction2.getNumerator());
		assertEquals(1, fraction2.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals(0.5, this.fraction.decimal(), 10e-5);
	}

	@Test
	public void testGetNumerator() {
		assertEquals(4, this.fraction.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(8, this.fraction.getDenominator());
	}
	
	@Test
    public void testFraccionImpropia() {
        assertEquals(false, this.fraction.isFraccionImpropia());
    }
	
	@Test
    public void testIsMayor() {
        assertTrue(this.fraction.isMayor(new Fraction(1, 3)));
    }
	
   @Test
    public void testisPropia() {
        assertTrue(this.fraction.isPropia());
    }
	
}
