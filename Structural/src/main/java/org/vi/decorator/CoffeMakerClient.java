package org.vi.decorator;


public class CoffeMakerClient {

    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        System.out.println("You got " + beverage.getDescription() + " = " + beverage.cost());


        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        System.out.println("You got " + beverage1.getDescription() + " = " + beverage1.cost());

        Beverage beverage2 = new Expresso();
        System.out.println("You got " + beverage2.getDescription() + " = " + beverage2.cost());

        Beverage beverage3 = new Expresso();
        System.out.println("You got " + beverage3.getDescription() + " = " + beverage3.cost());

    }
}

