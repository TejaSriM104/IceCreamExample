package com.thoughtworks.icecream;

public class SimpleIceCream implements IceCream {

    @Override
    public String makeIceCream() {
        return "Base IceCream";
    }

    @Override
    public int totalPrice() {
        return 100;
    }
}
