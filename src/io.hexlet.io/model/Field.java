package io.hexlet.xo.model;


public class Field {

	private static final int FIELD_SIZE = 3;

	private static final int MIN_SIZE = 0;

	private static final int MAX_SIZE = FIELD_SIZE;

	private static Figure[][] figures = new Figure[FIELD_SIZE][FIELD_SIZE];

	public int getSize() {
		return FIELD_SIZE;
	}

	public Figure getFigure(final Point point) throws InvalidPointException, AlreadyOccupiedException {
		if (!checkPoint(point)) {
			throw new InvalidPointException();
		}

		return field[point.getX()][point.getY()];
	}

	public setFigure(final Point point, final Figure figure) {
		if (!checkPoint(point)) {
			throw new InvalidPointException();
		}

		if (field[point.getX()][point.getY()] != null) {
			throw new AlreadyOccupiedException();
		}

		field[point.getX()][point.getY()] = figure;
	}

	private boolean checkPoint(final Point point) {
		return checkCoordinate(point.getX()) && checkCoordinate(point.getY());
	}

	private boolean checkCoordinate(final int coordinate) {
		return coordinate >= MIN_SIZE && coordinate < MAX_SIZE;
	}
}