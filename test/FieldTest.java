package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.AlreadyOccupiedException;
import io.hexlet.xo.model.exceptions.InvalidPointException;

public class FieldTest {

    @Test
	public void testGetSize() {
		final Field field = new Field();

		assertEquals(3, field.getSize());
	}

    @Test
	public void testSetFigure() {
		final Field field = new Field();
		final Point inputPoint = new Point(0, 0);
		final Figure inputFigure = Figure.O;
		final Figure expectedFigure = inputFigure;

		field.setFigure(inputPoint, inputFigure);
		final Figure actualFigure = field.getFigure(inputPoint);

		assertEquals(expectedFigure, actualFigure);
	}

	@Test
	public void testSetFigureWhenFigureNotSet() {
		final Field field = new Field();
		final Point inputPoint = new Point(0, 0);

		final Figure actualFigure = field.getFigure(inputPoint);

		assertNull(actualFigure);
	}

	@Test
	public void testSetFigureWhenXLessThanZero() {
		final Field field = new Field();
		final Point inputPoint = new Point(-1, 0);

		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch (final InvalidPointException e) {}
	}

	@Test
	public void testSetFigureWhenYLessThanZero() {
		final Field field = new Field();
		final Point inputPoint = new Point(0, -2);

		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch (final InvalidPointException e) {}
	}

	@Test
	public void testSetFigureWhenXMoreThanMax() {
		final Field field = new Field();
		final Point inputPoint = new Point(4, 0);

		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch (final InvalidPointException e) {}
	}

	@Test
	public void testSetFigureWhenYMoreThanMax() {
		final Field field = new Field();
		final Point inputPoint = new Point(0, 6);

		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch (final InvalidPointException e) {}
	}

	@Test
	public void testSetFigureWhenAlreadyOccupied() {
		final Field field = new Field();
		final Point inputPoint = new Point(0, 0);
		final Figure inputFigure = Figure.X;

		field.setFigure(inputPoint, inputFigure);

		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch (final AlreadyOccupiedException e) {}
	}
}