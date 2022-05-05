package com.thoughtworks.icecream;

public class ChocolateDecorator extends IceCreamDecorator {

    public ChocolateDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    public String makeIceCream() {
        return specialIceCream.makeIceCream() + addHoney();
    }

    public int totalPrice() {
        return specialIceCream.totalPrice() + this.price;
    }

    private String addHoney() {
        this.price = 40;
        return " + sweet honey";
    }
}
