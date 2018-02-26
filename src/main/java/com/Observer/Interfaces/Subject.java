package com.Observer.Interfaces;

public interface Subject {
    public void removeSubscriber(Observer subscriber);
    public void addSubscriber(Observer subscriber);
    public void notifySubscribers();

}
