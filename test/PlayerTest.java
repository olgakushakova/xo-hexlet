package io.hexlet.xo.model;

import org.junit.Test;


public class PlayerTest {
	
	@Test
	public void testGetName() throws Exception {

		final String testValue = "Olya";
		final expectedVaue = testValue;
		final Player player = new Player(testValue, Figure.O);
		final String actualValue = player.getName();

		assertEquals(expectedVaue, actualValue);
	}

	@Test
	public void testGetFigure() throws Exception {

		final String testValue = Figure.X;
		final expectedVaue = testValue;
		final Player player = new Player("Olya", testValue);
		final String actualValue = player.getFigure();

		assertEquals(expectedVaue, actualValue);
}