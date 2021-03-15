package com.tactfactory.designpatternniveau1.observer.tp1;

public class ConcreteObserver implements Observer {

	private String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(int state) {
		System.out.println(this.name + " " + Integer.toHexString(state));
	}
}
