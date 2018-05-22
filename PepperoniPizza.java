package Pl.Pizza.PizzaModel;

import Pl.Pizza.PizzaOrder.Product;

public class PepperoniPizza extends RawPizza implements Pizza {

    public PepperoniPizza()
    {
        System.out.println("Pepperoni pizza");
    }



    @Override
    public double koszt() {
        return 25;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
