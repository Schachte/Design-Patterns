package com.Observer.controller;

import com.Observer.Interfaces.Observer;

public class ObserverImpl implements Observer{
    String messageUpdate;
    String whoAmI;

    public ObserverImpl(String whoAmI) {
        this.whoAmI = whoAmI;
    }

    @Override
    public void getUpdate() {
        if (messageUpdate == null)
            System.out.println("No updates available!");
        else
            System.out.println(whoAmI + " : " + messageUpdate);
    }

    @Override
    public void setUpdate(Object update) {
        this.messageUpdate = (String) update;
    }
}
