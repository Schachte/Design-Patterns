package com.Observer.controller;


import com.Observer.Interfaces.Observer;
import com.Observer.Interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> subscribers;
    private String newsletter;

    public SubjectImpl() {
        this.subscribers = new ArrayList<Observer>();
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void addSubscriber(Observer subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void notifySubscribers() {

        if (this.subscribers.size() == 0) {
            System.out.println("No one has been registered!");
        }
        else {
            for (Observer obs : this.subscribers) {
                obs.setUpdate(newsletter);
                obs.getUpdate();
            }
        }
    }

    public void notifyEveryone(String update) {
        this.newsletter = update;
        this.notifySubscribers();
    }
}
