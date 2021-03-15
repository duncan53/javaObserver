package com.tactfactory.designpatternniveau1.observer.tp1;

public class octalObserver implements Observer {
	private String name;

	public octalObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(int state) {
		System.out.println(this.name + " " + Integer.toOctalString(state));
	}
}
