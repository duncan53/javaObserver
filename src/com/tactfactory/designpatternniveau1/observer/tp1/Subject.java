package com.tactfactory.designpatternniveau1.observer.tp1;


import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

  private final List<Observer> observers = new ArrayList<Observer>();

  public void attach(Observer observer) {
    if (!observers.contains(observer)) {
      this.observers.add(observer);
    }
  }

  public void detach(Observer observer) {
    if (observers.contains(observer)) {
      this.observers.remove(observer);
    }
  }

  protected void notifyObservers(int state) {
    for (Observer observer : observers) {
      observer.update(state);
    }
  }
}
