package com.company;

public abstract class BouquetDecorator implements AddDecorator{
    private AddDecorator decorator;
    public BouquetDecorator(AddDecorator decorator) {
        this.decorator = decorator;
    }
    @Override
    public String addDecorator() {
        return decorator.addDecorator();
    }

}
