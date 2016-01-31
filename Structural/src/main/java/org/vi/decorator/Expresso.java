package org.vi.decorator;

class Expresso extends Beverage {

    Expresso() {
        this.description = "EXPRESSO";
    }

    @Override
    public double cost() {
        return 0.40;
    }
}


