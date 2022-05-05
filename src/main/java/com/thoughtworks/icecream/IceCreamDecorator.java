package com.thoughtworks.icecream;

public abstract class IceCreamDecorator implements IceCream {

    protected IceCream specialIceCream;
    protected int price;

    public IceCreamDecorator(IceCream specialIcecream) {
        this.specialIceCream = specialIcecream;
    }

    public String makeIceCream() {
        return specialIceCream.makeIceCream();
    }

    public int totalPrice() {
        return specialIceCream.totalPrice();
    }
}
