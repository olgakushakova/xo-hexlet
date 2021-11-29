package io.hexlet.xo.model;

public Player {

	private final String name;

	private final Figure figure;

	public Player(final String name, Figure figure) {
		this.name = name;
		this.figure = figure;
	}

	public String getName() {
		return name;
	}

	public Figue getFigure() {
		return figure;
	}
}