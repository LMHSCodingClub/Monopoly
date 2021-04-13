package com.lmhscodingclub.monopoly.playerdata;

import java.util.ArrayList;
import java.util.List;

public class Ownership {
    double balance;
    List<Property> properties;

    public Ownership() {
        properties = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public List<Property> getProperties() {
        return properties;
    }
}