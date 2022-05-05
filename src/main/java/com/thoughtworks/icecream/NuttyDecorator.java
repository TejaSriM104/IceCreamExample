package com.thoughtworks.icecream;

public class NuttyDecorator extends IceCreamDecorator {

    public NuttyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    public String makeIceCream() {
        return specialIceCream.makeIceCream() + addNuts();
    }

    public int totalPrice() {
        return specialIceCream.totalPrice() + this.price;
    }

    private String addNuts() {
        this.price = 50;
        return " + cruncy nuts";
    }

}
