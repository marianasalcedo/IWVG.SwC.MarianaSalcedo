package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private static final int INITIAL_NUMBER = 123333;
	private static final String LAST_NAME = "Salcedo";
	private static final String FIRST_NAME = "Mariana";
	User user;
	
	@Before
	public void before() {
		user = new User(123333, FIRST_NAME, LAST_NAME);
	}

	@Test
	public void testUserIntStrStr() {
		assertEquals(LAST_NAME, this.user.getFamilyName());
		assertEquals(FIRST_NAME, this.user.getName());
		assertEquals(INITIAL_NUMBER, this.user.getNumber());
	}

	@Test
	public void testFullName() {
		assertEquals(FIRST_NAME + " " + LAST_NAME, this.user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("M.", this.user.initials());
	}

	@Test
	public void testGetNumber() {
		assertEquals(INITIAL_NUMBER, this.user.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals(FIRST_NAME, this.user.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals(LAST_NAME, this.user.getFamilyName());
	}
}
