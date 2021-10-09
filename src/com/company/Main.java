package com.company;

public class Main {

    public static void main(String[] args) {
	AddDecorator decorator1 = new ToOrder();
    AddDecorator decorator2 = new AddChocolate(new ToOrder());
    AddDecorator decorator3 = new AddToy(new ToOrder());
        System.out.println(decorator1.addDecorator());
        System.out.println(decorator2.addDecorator());
        System.out.println(decorator3.addDecorator());
    }
}
