package com.thoughtworks.icecream;

public class Driver {

    public static void main(String args[]) {
        IceCream iceCream = new ChocolateDecorator(new NuttyDecorator(new SimpleIceCream()));

        System.out.println(iceCream.makeIceCream());

        System.out.println(iceCream.totalPrice());

    }
}
