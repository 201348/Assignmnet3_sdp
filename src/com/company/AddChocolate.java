package com.company;

public class AddChocolate extends BouquetDecorator{
    public AddChocolate(AddDecorator decorator) {
        super(decorator);
    }
    String addChocolate() {
        return "choose a chocolate ";
    }
    @Override
    public String addDecorator() {
        return super.addDecorator() + addChocolate();
    }
}
