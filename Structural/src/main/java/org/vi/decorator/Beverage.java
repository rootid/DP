package org.vi.decorator;

public abstract class Beverage {

    protected String description = "UNNAMED BEVERAGE";

    protected abstract double cost();

    protected String getDescription() {
        return description;
    }
}