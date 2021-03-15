package com.tactfactory.designpatternniveau1.observer.tp1;

public class ConcreteSubject extends Subject {

	private String name;
	private int state;

	public ConcreteSubject() {
	}

	public ConcreteSubject(String name, int state) {
		this.name = name;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObservers(state);
	}

}
