package org.vi.decorator;


public class CondimentDecorator extends Beverage {

    @Override
    protected double cost() {
        return 0;
    }

    @Override
    protected String getDescription() {
        return super.getDescription();
    }
}
