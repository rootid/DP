package org.vi.decorator;

class DarkRoast extends Beverage {

    DarkRoast() {
        this.description = "DarkRaost";
    }

    @Override
    public double cost() {
        return 0.50;
    }


}
