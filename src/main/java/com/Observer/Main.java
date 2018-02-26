package com.Observer;

import com.Observer.Interfaces.Observer;
import com.Observer.controller.ObserverImpl;
import com.Observer.controller.SubjectImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing newsletter system!");
        SubjectImpl sub = new SubjectImpl();

        Observer obs1 = new ObserverImpl("code@asu.edu");
        Observer obs2 = new ObserverImpl("monkeyman454@gmail.com");
        Observer obs3 = new ObserverImpl("googlemuffin56@yahoo.com");
        Observer obs4 = new ObserverImpl("zezima13@hotmail.com");

        sub.addSubscriber(obs1);
        sub.addSubscriber(obs2);
        sub.addSubscriber(obs3);
        sub.addSubscriber(obs4);

        sub.removeSubscriber(obs3);
        sub.removeSubscriber(obs4);

        sub.notifyEveryone("Hey, we have a deal going on!");

    }
}
