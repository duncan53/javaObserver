package com.tactfactory.designpatternniveau1.observer.tp1;

public class binaryObserver implements Observer{

	private String name;

	public binaryObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(int state) {
		System.out.println(this.name + " " + Integer.toBinaryString(state));
	}
}
