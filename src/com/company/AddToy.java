package com.company;

public class AddToy extends BouquetDecorator{
    public AddToy(AddDecorator decorator) {
        super(decorator);
    }
    String addToy() {
        return "choose a toy ";
    }
    @Override
    public String addDecorator() {
        return super.addDecorator() + addToy();
    }
}
